package labC;

import java.io.*; // Filhanteringen

public class Exercise1 {
	private Commodity[] commodities;

	public void setCommodities( Commodity[] commodities ) { 
		this.commodities = commodities;
	}

	public void list() {
		for( int i = 0; i < commodities.length; i++ ) {
			System.out.println( commodities[ i ].toString() ); 
		}
	}

	public void writeCommodities( String filename ) {
		try {
			FileOutputStream fos = new FileOutputStream( filename );
			BufferedOutputStream bos = new BufferedOutputStream( fos );
			DataOutputStream dos = new DataOutputStream( bos );

			// Här ska vi skriva kod som överför data till filen
			dos.writeInt(commodities.length); // Inleda filen med antalet Commodity- objekt som lagras i filen
			for( int i = 0; i < commodities.length; i++ ) {
				dos.writeLong( commodities[ i ].getId() );
				dos.writeUTF( commodities[ i ].getName() );
				dos.writeInt( commodities[ i ].getQuantity() );
				dos.writeDouble( commodities[ i ].getPrice() );
			}
			
			dos.close();
	    } catch( IOException e ) {
	        System.out.println( e );
	    }
	}

	public void readCommodities( String filename ) {
		try {
			FileInputStream fis = new FileInputStream( filename );
			BufferedInputStream bis = new BufferedInputStream( fis );
			DataInputStream dis = new DataInputStream( bis );
			
			// Här ska data läsas in, göras om till Commodity-objekt och lagras i Commodity-array
			int size; // lagra antalet varor som finns på filen 
			long id; // lagra en varas id
			String name; // lagra en varas namn
			int quantity;// lagra antalet av en vara
			double price; // lagra varans pris
			
			size = dis.readInt();
			commodities = new Commodity[ size ];
			
			for( int i = 0; i < commodities.length; i++ ) {
			    id = dis.readLong();
			    name = dis.readUTF();
			    quantity = dis.readInt();
			    price = dis.readDouble();
			    commodities[ i ] = new Commodity( id, name, quantity, price );
			}
			
			dis.close();
		} catch( IOException e ) {
			System.out.println( e );
		}
	} 
}