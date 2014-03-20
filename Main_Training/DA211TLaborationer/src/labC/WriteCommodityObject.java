package labC;

public class WriteCommodityObject {
	public static void main( String[] args ) {
		Commodity[] arr = { new Commodity ( 19874655,"Fotboll",23,299.95 ),
				new Commodity( 48993365,"Vas",52,38.75 ),
				new Commodity( 24355293,"Stol",18,795 ),
				new Commodity( 76762292,"Cykel",3,2990 ) };
		Exercise5 e5 = new Exercise5();
		e5.setCommodities( arr );
		e5.list();
		e5.writeCommodities( "/Users/Prince/Documents/temp/commoditiesObject.dat" );
	}
}
