package engine;

import java.sql.*;
import java.util.Random;

/**
 * Klass som kopplar sig till databasen och h��mtar eller skriver till databasen.
 * @author Prince
 *
 */
public class DatabaseClient{
	private Statement statement;

	/**
	 * Konstruktor initierar anslutning med databas, ��r anslutning ej fullst��ndig avslutas visas felmeddelande.
	 */
	public DatabaseClient(Statement statement){
		this.statement = statement;
	}

	/**
	 * Metod tar fr��gan fr��n klienten och svarar.
	 */
	public String[] answerQuestion(String question){
		String[] answerNotFound = {"Error! Question could not be answered!"};
		if(question.startsWith("utestalle_detaljer_")){
			return getUtestalleDetaljer("SELECT namn,address,aldersgrans,intrade,telefonnummer,oppettider,erbjudande,kategori,koordinater_latitud,koordinater_longitud FROM Utestallen", question.replaceFirst("utestalle_detaljer_", ""));
		} else if(question.startsWith("rk_")){
			return getRowsOnColumn("SELECT kommentar FROM Kommentarer WHERE utestallenamn = '"+question.replaceFirst("rk_", "")+"'");
		} else if(question.startsWith("rkt_")){
			return getRowsOnColumn("SELECT kommentartitel FROM Kommentarer WHERE utestallenamn = '"+question.replaceFirst("rkt_", "")+"'");
		} else if(question.startsWith("wk_")){
			String questionProcessed = question.replace("wk_", "");
			String splitterCommand = "~";
			String[] splits = questionProcessed.split(splitterCommand);
			return writeComment(splits[0], splits[1], splits[2]);
		} if (question.startsWith("utestallelogos")){
			answerQuestionWithImage(question);
		}
		else {
			switch(question){
			case "utestallen_erbjudande": return getErbjudandeFromUtestalle();
			case "utestallen_namn_lista": return getRowsOnColumn("SELECT namn FROM Utestallen ORDER BY namn");
			case "utestallen_address_lista": return getRowsOnColumn("SELECT address FROM Utestallen ORDER BY namn");
			case "utestallen_aldersgrans_lista": return getRowsOnColumn("SELECT aldersgrans FROM Utestallen ORDER BY namn");
			case "utestallen_typ_lista": return getRowsOnColumn("SELECT kategori FROM Utestallen ORDER BY namn");
			case "utestallen_koordinatLat_lista": return getRowsOnColumn("SELECT koordinater_latitud FROM Utestallen ORDER BY namn");
			case "utestallen_koordinatLng_lista": return getRowsOnColumn("SELECT koordinater_longitud FROM Utestallen ORDER BY namn");

			case "systembolaget_namn_lista": return getRowsOnColumn("SELECT namn FROM Systembolag ORDER BY namn");
			case "systembolaget_address_lista": return getRowsOnColumn("SELECT address FROM Systembolag ORDER BY namn");
			case "systembolaget_nummer_lista": return getRowsOnColumn("SELECT nummer FROM Systembolag ORDER BY namn");
			case "systembolaget_opettiderlank_lista": return getRowsOnColumn("SELECT oppettiderlank FROM Systembolag ORDER BY namn");
			case "systembolaget_koordinatLat_lista": return getRowsOnColumn("SELECT koordinater_latitud FROM Systembolag ORDER BY namn");
			case "systembolaget_koordinatLng_lista": return getRowsOnColumn("SELECT koordinater_longitud FROM Systembolag ORDER BY namn");

			case "taxi_namn_lista": return getRowsOnColumn("SELECT namn FROM Taxi ORDER BY namn");
			case "taxi_nummer_lista": return getRowsOnColumn("SELECT nummer FROM Taxi ORDER BY namn");
			case "taxi_hemsida_lista": return getRowsOnColumn("SELECT hemsida FROM Taxi ORDER BY namn");

			case "drinkrecept_namn_lista": return getRowsOnColumn("SELECT namn FROM Drinkrecept ORDER BY namn");
			case "drinkrecept_instruktion_lista": return getRowsOnColumn("SELECT instruktion FROM Drinkrecept ORDER BY namn");
			case "drinkrecept_kategorier_lista": return getRowsOnColumn("SELECT kategori FROM Drinkrecept ORDER BY namn");

			case "olspel_namn_lista": return getRowsOnColumn("SELECT namn FROM Olspel ORDER BY namn");
			case "olspel_instruktioner_lista": return getRowsOnColumn("SELECT instruktioner FROM Olspel ORDER BY namn");
			case "olspel_antalspelare_lista": return getRowsOnColumn("SELECT antalspelare FROM Olspel ORDER BY namn");
			case "olspel_krav_lista": return getRowsOnColumn("SELECT krav FROM Olspel ORDER BY namn");
			}
		}
		return answerNotFound;
	}

	public Object[] answerQuestionWithImage(String question){
		return getUtesstalleLogos("SELECT logo FROM Utestallen ORDER BY namn");
	}

	private Object[] getUtesstalleLogos(String column){
		try {
			ResultSet resultSet = statement.executeQuery(column);
			resultSet.last();
			Object[] rows = new String[resultSet.getRow()];
			int count = 0;
			resultSet.beforeFirst();
			while(resultSet.next()) {
				rows[count] = resultSet.getObject(1).toString();
				count++;
			}
			return rows;
		} catch (SQLException e) {}
		return null;
	}
	
	/**
	 * Metod som skickar en random erbjudande från en av uteställena
	 */
	private String[] getErbjudandeFromUtestalle(){
		String[] erbjudandeLista = getRowsOnColumn("SELECT erbjudande FROM Utestallen");
		Random random = new Random();
		String[] valdErbjudande = new String[1];
		valdErbjudande[0] = erbjudandeLista[random.nextInt(erbjudandeLista.length)];
		return valdErbjudande;
	}

	/**
	 * Metod returnerar alla rows i den utvalda kolumnen.
	 */
	private String[] getRowsOnColumn(String column){
		try {
			ResultSet resultSet = statement.executeQuery(column);
			resultSet.last();
			String[] rows = new String[resultSet.getRow()];
			int count = 0;
			resultSet.beforeFirst();
			while(resultSet.next()) {
				rows[count] = resultSet.getObject(1).toString();
				count++;
			}
			return rows;
		} catch (SQLException e) {}
		return null;
	}


	private String[] getUtestalleDetaljer(String columns, String utestalleNamn){
		try {
			ResultSet resultSet = statement.executeQuery(columns);
			String[] res = new String[10];
			while(resultSet.next()) {
				if(resultSet.getObject(1).toString().equals(utestalleNamn)){
					res[0] = resultSet.getObject(1).toString();
					res[1] = resultSet.getObject(2).toString();
					res[2] = resultSet.getObject(3).toString();
					res[3] = resultSet.getObject(4).toString();
					res[4] = resultSet.getObject(5).toString();
					res[5] = resultSet.getObject(6).toString();
					res[6] = resultSet.getObject(7).toString();
					res[7] = resultSet.getObject(8).toString();
					res[8] = resultSet.getObject(9).toString();
					res[9] = resultSet.getObject(10).toString();
					break;
				}
			}
			return res;
		} catch (SQLException e) {}
		return null;
	}

	private String[] writeComment(String utestalleNamn, String titel, String kommentar){
		String[] commentIsWritten = new String[1];
		try {
			String sql = "INSERT INTO Kommentarer(utestallenamn, kommentartitel, kommentar) VALUES ('"+utestalleNamn+"','"+titel+"','"+kommentar+"')";
			statement.executeUpdate(sql);
			commentIsWritten[0] = "true";
			return commentIsWritten;
		} catch (SQLException e) {
			commentIsWritten[0] = "false";
			return commentIsWritten;
		}
	}

	//	public boolean nyforetagSIMULERING(){
	//		try {
	//			String sql = "INSERT INTO TestTabell VALUES ('TestKolumn')";
	//			statement.executeUpdate(sql);
	//			return true;
	//		} catch (SQLException e) {
	//			System.out.println("failed simulator");
	//			return false;
	//		}
	//	}

	//	public String hamtaforetagSIMULERING(){
	//		try {
	//			String sql = "SELECT foretag_namn FROM foretag";
	//			ResultSet resultSet;
	//			resultSet = statement.executeQuery(sql);
	//			ResultSetMetaData meta = (ResultSetMetaData) resultSet.getMetaData();
	//			String res = "";
	//			int colCount = meta.getColumnCount();
	//			for(int i=1; i<=colCount; i++)
	//				res += meta.getColumnLabel(i) + ", ";
	//			res += "\n";
	//			while(resultSet.next()) {
	//				for(int i=1; i<=colCount; i++)
	//					res += resultSet.getObject(i).toString() + ", ";
	//				res += "\n";
	//			}
	//			System.out.println(res);
	//			return res;
	//		}catch (SQLException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		return null;
	//	}

}