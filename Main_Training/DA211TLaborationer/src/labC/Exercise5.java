package labC;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exercise5 {
	private Commodity[] commodities;

	public void setCommodities(Commodity[] commodities){
		this.commodities = commodities;
	}

	public void list(){
		for(int i = 0; i<commodities.length; i++){
			System.out.println(commodities[i].toString());
		}
	}

	public void writeCommodities( String filename ) {
		try{
			FileOutputStream fos = new FileOutputStream( filename );
			BufferedOutputStream bos = new BufferedOutputStream( fos );
			ObjectOutputStream oos = new ObjectOutputStream( bos );

			oos.writeInt(commodities.length);
			for(int i = 0; i<commodities.length; i++){
				oos.writeObject(commodities[i]);
			}

			oos.close();
		}  catch( IOException e ){
			System.out.println( e );
		}
	}

	public void readCommodities( String filename ){
		try{
			FileInputStream fis = new FileInputStream( filename );
			BufferedInputStream bis = new BufferedInputStream( fis );
			ObjectInputStream ois = new ObjectInputStream( bis );
			int nbr;
			Commodity com;

			nbr = ois.readInt();
			commodities = new Commodity[ nbr ];
			for(int i= 0; i<commodities.length; i++){
				com = ( Commodity )ois.readObject();
				commodities[i] = com;
			}
		ois.close();
	} catch( IOException e ) {
		System.out.println( e );
	} catch( ClassNotFoundException e2 ){
		System.out.println( e2 );
	}
}
}