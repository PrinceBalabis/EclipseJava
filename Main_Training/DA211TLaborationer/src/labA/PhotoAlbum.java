package labA;

import java.util.ArrayList;

public class PhotoAlbum {
	private ArrayList<Photo> photos = new ArrayList<Photo>();

	// photo läggs till sist i register
	public void add(Photo photo) { 
		photos.add(photo);
	}
	// Om photo finns i register tas det bort och true returneras. Om photo inte finns i register
	// ska metoden returnera false
	public boolean remove(Photo photo) { 
		boolean answer = false;
		for(int i=photos.size()-1; i>=0; i--){
			if(photos.get(i) == photo){
				photos.remove(i);
				answer = true;
			}
		}
		return answer;
	}

	// Metoden returnerar antalet Photo-objekt som lagras i albumet
	public int size() {
		return photos.size();
	}

	// Metoden ska returnera Photo-objektet i angiven position. Om index är en position som inte
	// finns i listan ska undantaget IndexOutOfBoundsException kastas.
	public Photo get( int index ) {
		if(index > photos.size()){
			throw new IndexOutOfBoundsException();
		} else {
			return photos.get(index);
		}
	}

	// Skriver ut alla Photo-objekt i register med hjälp av toString-metoden
	public void listAll() {
		for(int i=0; i<photos.size(); i++){
			System.out.println(photos.get(i).toString());
		}
		//		Lösning enligt alternativ 2
		//	    	Iterator iter = photos.iterator();
		//	    	while(iter.hasNext()) {
		//	    		System.out.println( iter.next().toString() );
		//			}
	}

	// Returnerar ett ArrayList-objekt som innehåller alla bilder av viss kategori
	public ArrayList<Photo> getCategory(int category) { 
		ArrayList<Photo> res = new ArrayList<Photo>();
		for(int i=0; i<photos.size(); i++){
			if(photos.get(i).getCategory() == category){
				res.add(photos.get(i));
			}
		}
		return res;
	}

	// Returnerar ett nytt PhotoAlbum-objekt som innehåller alla bilder från ett visst årtal. Det gamla
	// albumet ska vara oförändrat.
	public PhotoAlbum getYear(int year) {
		PhotoAlbum res = new PhotoAlbum();
        for(int i=0; i<photos.size(); i++){
        	if(photos.get(i).getYear() == year){
        	res.add(photos.get(i));
        	}
        }
        return res;
	}
}
