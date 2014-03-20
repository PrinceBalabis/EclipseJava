package laboration21;

public class CD extends Media{
	String artist;
	String[] songs;
	
	public CD(long id, String title, String artist, String[] songs){
		super(id, title);
		this.artist = artist;
		this.songs = songs;
	}
	
	public void setArtist(String artist){
		this.artist = artist;
	}
	
	public String getArtist(){
		return artist;
	}
	
	public void setSongs(String[] songs){
		this.songs = songs;
	}
	
	public String[] getSongs(){
		return songs;
	}
	
	public String toString(){
		String list = "Artist: " + artist +
				"\nAlbum: " + super.getTitle() +
				"\nMelodier:\n";
		
		for(String i : songs){
			list += i + "\n";
		}
		
		return list;
	}
}
