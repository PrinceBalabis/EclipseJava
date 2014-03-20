package labA;

import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		PhotoAlbum photoAlbum = new PhotoAlbum();
		Photo photo;
		Photo p1 = new Photo("På badstranden", 2003, Photo.FAMILY, "C:/bilder/bada.jpg");
		Photo p2 = new Photo("Tältet", 2003, Photo.FAMILY, "C:/bilder/campa.jpg");
		Photo p3 = new Photo("Italien", 2003, Photo.TRAVEL, "C:/bilder/italien.jpg");
		photoAlbum.add(p1);
		photoAlbum.add(p2);
		photoAlbum.add(new Photo("Jenny hoppar", 2002, Photo.GRANDCHILD,
		"C:/bilder/jenny1.jpg"));
		photoAlbum.add(new Photo("Erik 4 år", 2003, Photo.GRANDCHILD,
		"C:/bilder/erik4.jpg"));
		photoAlbum.add(p3);
		System.out.println("SAMTLIGA FOTO, " + photoAlbum.size() + " st");
		photoAlbum.listAll();
		PhotoAlbum year2003 = photoAlbum.getYear(2003);
		System.out.println("\nÅr 2003");
		year2003.listAll();
		ArrayList<Photo> children = photoAlbum.getCategory(Photo.GRANDCHILD);
		System.out.println("\nBARNBARNEN");
		Iterator<Photo> iter = children.iterator();
		while(iter.hasNext()) {
		    photo = iter.next();
		    System.out.println(photo);
		}
		System.out.println("\nBARNBARNEN ÅR 2003");
		ArrayList<Photo> barnbarn2003 = year2003.getCategory(Photo.GRANDCHILD);
		for(int i=0; i<barnbarn2003.size(); i++)
		    System.out.println(barnbarn2003.get(i));
		photoAlbum.remove(p2);
		System.out.println("\nSAMTLIGA FOTO");
		photoAlbum.listAll();
	}

}
