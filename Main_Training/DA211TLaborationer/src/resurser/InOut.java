package resurser;

import javax.swing.JOptionPane;

public class InOut {


	public static int readInt(String txt){
		int nbr = 0;
		boolean intVerified = false;
		do{
			try{
				nbr = Integer.parseInt(JOptionPane.showInputDialog(null, txt, "Indata", JOptionPane.PLAIN_MESSAGE));
				intVerified = true;
			}catch(Exception e){}
		} while(intVerified == false);
		return nbr;
	}

	public static int readInt(){
		int nbr = 0;
		boolean intVerified = false;
		do{
			try{
				nbr = Integer.parseInt(JOptionPane.showInputDialog(null, "Mata in ett heltal", "Indata", JOptionPane.PLAIN_MESSAGE));
				intVerified = true;
			}catch(Exception e){}
		} while(intVerified == false);
		return nbr;
	}

	public static double readDouble(String txt){
		double nbr = 0;
		boolean intVerified = false;
		do{
			try{
				nbr = Double.parseDouble(JOptionPane.showInputDialog(null, txt, "Indata", JOptionPane.PLAIN_MESSAGE));
				intVerified = true;
			}catch(Exception e){}
		}while(intVerified == false);
		return nbr;
	}

	public static double readDouble(){
		double nbr = 0;
		boolean intVerified = false;
		do{
			try{
				nbr = Double.parseDouble(JOptionPane.showInputDialog(null, "Mata in ett heltal"));
				intVerified = true;
			}catch(Exception e){}
		}while(intVerified == false);
		return nbr;
	}
}
