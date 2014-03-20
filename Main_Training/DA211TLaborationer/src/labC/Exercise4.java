package labC;

import java.io.*;

public class Exercise4 {
	private Commodity[] commodities;
	
	public void setCommodities( Commodity[] commodities ) {
		this.commodities = commodities;
	}
	
	public void list() {
		for( int i = 0; i < commodities.length; i++ ) {
			System.out.println(commodities[ i ].toString() );
		}
	}
	
	public void writeCommodities( String filename ) {
		try{
			FileWriter fw = new FileWriter( filename );
			BufferedWriter bw = new BufferedWriter( fw );
		
			bw.write( String.valueOf(commodities.length));
			bw.newLine();
			
			bw.close();
		}catch( IOException e ){
			System.out.println( e );
		}
}
	
	public void readCommodities ( String filename ) {
		
	}
}