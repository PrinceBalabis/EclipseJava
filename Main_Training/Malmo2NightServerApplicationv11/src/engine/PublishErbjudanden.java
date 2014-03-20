package engine;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Sender;

public class PublishErbjudanden extends Thread{
	Statement statement;

	public PublishErbjudanden(Statement statement) {
		this.statement = statement;
		new Checker().start();
	}

	private class Checker extends Thread{
		public void run() {
			Sender sender;
			Message message;
			String[] erbjudanden;
			ArrayList<String> newErbjudanden = new ArrayList<String>();
			ArrayList<String> oldErbjudanden = new ArrayList<String>();
			ArrayList<String> devicesList;
			MulticastResult result;
			String[] devices;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e2) {}
			while(true){
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e1) {}
				System.out.println("KOLLAR");
				erbjudanden = getRowsOnColumn("SELECT erbjudande FROM Utestallen");
				if(!oldErbjudanden.isEmpty()){

					for (int i = 0; i < erbjudanden.length; i++) {
						newErbjudanden.add(erbjudanden[i]);
					}

					for (int i = 0; i < newErbjudanden.size(); i++) {
						if(!newErbjudanden.get(i).equals(oldErbjudanden.get(i))){
							sender = new Sender("AIzaSyByCK4JqOVJhkwOlj9KApqeruGOJuLbwq0");
							message = new Message.Builder().timeToLive(3).delayWhileIdle(true).addData("price",erbjudanden[i]).build();
							try {
								devices = getRowsOnColumn("SELECT gcm_regid FROM gcm_users");
								devicesList = new ArrayList<String>();
								for (int j = 0; j < devices.length; j++) {
									devicesList.add(devices[j]);
								}
								result = sender.send(message,devicesList, 1);

							} catch (IOException e) {}
						}
					}
					newErbjudanden.clear();
				}
				oldErbjudanden.clear();
				for (int i = 0; i < erbjudanden.length; i++) {
					oldErbjudanden.add(erbjudanden[i]);
				}
			}

		}
	}


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
}
