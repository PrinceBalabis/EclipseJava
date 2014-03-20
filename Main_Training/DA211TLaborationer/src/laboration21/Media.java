package laboration21;

public class Media {
	private long id;
	private String title;
	
	public Media(long id, String title){
		this.id = id;
		this.title = title;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId( long id ) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		String res = "Media: ID = " + this.id + ", Titel = " + this.title + "\n" + super.toString();
		return res;
		}
}