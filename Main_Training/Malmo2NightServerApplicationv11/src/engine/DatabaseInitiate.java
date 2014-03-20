package engine;

import java.sql.*;
import javax.swing.JOptionPane;


public class DatabaseInitiate {
	private Statement statement;
	
	public DatabaseInitiate(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/malmo2nightappdatabase", "malmo2nightapp", "yolo1234");
			statement = connection.createStatement();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Databas kunde inte anslutas!");
			System.exit(0);
		}
	}
	
	public Statement getStatement(){
		return statement;
	}
}