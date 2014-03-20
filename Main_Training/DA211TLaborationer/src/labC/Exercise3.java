package labC;

import java.io.*;
import java.util.ArrayList;

public class Exercise3 {
	private ArrayList<Population> population = new ArrayList<Population>();
	
	public void setPopulation(Population[] pop) {
	population.clear(); // så att population är tom från början
		for (int i = 0; i < pop.length; i++) {
			population.add(pop[i]);
		}
	}

	// används i Uppgift 6
	public ArrayList<Population> getPopulation() {
		return population;
	}
	
	public void list() {
		for (int i = 0; i < population.size(); i++) {
			System.out.println(population.get(i).toString()); }
	}
	
	public void writePopulation(String filename) {
		try{
			FileOutputStream fos = new FileOutputStream( filename );
			BufferedOutputStream bos = new BufferedOutputStream( fos );
			DataOutputStream dos = new DataOutputStream( bos );
		
			dos.writeInt(population.size());
			
			for(int i = 0; i < population.size(); i++){
				dos.writeUTF( population.get(i).getName());
				dos.writeLong(population.get(i).getInhabitants());
			}
			
			dos.close();
		} catch( IOException e ){
			System.out.println( e );
		}
	}
	
	public void readPopulation(String filename) {
		try{
			FileInputStream fis = new FileInputStream( filename );
			BufferedInputStream bis = new BufferedInputStream( fis );
			DataInputStream dis = new DataInputStream( bis );
			
			int size;
			size = dis.readInt();
			System.out.println(size);
				for(int i = 0; i < size; i++){
					population.add(new Population(dis.readUTF(), dis.readLong()));
				}
			
			
			dis.close();
		} catch( IOException e ){
			System.out.println( e );
		}
	}
}