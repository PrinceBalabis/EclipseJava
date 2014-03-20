 package labA;
import java.util.*;

public class Exercise5 {
    public void listPhotos( ArrayList<Photo> photos ) {
        System.out.println("Antal foton: " + photos.size());
        for(int i = 0; i<photos.size(); i++){
        	System.out.println("Motiv: " + photos.get(i).getTitle() + "   Årtal: " + photos.get(i).getYear());
        }
    }
    
    public void reverse( ArrayList<Photo> photos ) {
    	System.out.println();
        for(int i=photos.size()-1; i>=0; i--){
        	System.out.println("Motiv: " + photos.get(i).getTitle() + "   Årtal: " + photos.get(i).getYear());
        }
        System.out.println("Antal foton: " + photos.size());
    }
    
    public void removeYear( ArrayList<Photo> photos, int year ) {
    	System.out.println();
    	for(int i=photos.size()-1; i>=0; i--){
    		if(photos.get(i).getYear() == year){
    			photos.remove(photos.get(i));
    		}
    	}
    }
    
    public static void main(String[] args) {
        Exercise5 u5 = new Exercise5();
        ArrayList<Photo> list = new ArrayList<Photo>();
        Photo f1 = new Photo("Vi cyklar", 2004, Photo.FAMILY, "C:/bilder/tandem.jpg");
        Photo f2 = new Photo("Nu är det vår", 2003, Photo.FAMILY, "C:/bilder/spring.jpg");
        Photo f3 = new Photo("Vinter i Italien", 2003, Photo.TRAVEL, "C:/bilder/italien.jpg");
        Photo f4 = new Photo("Hugo i sandlådan", 2007, Photo.GRANDCHILD, "C:/bilder/hugo2007.jpg");
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        
        // a
        u5.listPhotos( list );
        // b
        u5.reverse( list );
        // c
        u5.removeYear( list, 2003);
        u5.listPhotos( list );
    }
}
