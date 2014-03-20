package laboration14;

public class Contact {
	String name;
	PhoneNumber phone;
	
	
	public Contact(String name, String home, String work, String mobile){
		this.name = name;
		this.phone = new PhoneNumber(home, work, mobile);
		}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setHome(String home){
		this.phone.setHome(home);
	}
	
	public void setWork(String work){
		this.phone.setWork(work);
	}
	
	public void setMobile(String mobile){
		this.phone.setMobile(mobile);
	}
	
	public String getName(){
		return name;
	}
	
	public String getHome(){
		return this.phone.getHome();
	}
	
	public String getWork(){
		return this.phone.getWork();
	}
	
	public String getMobile(){
		return this.phone.getMobile();
	}
	
	public String toString(){
		return ("Contact: " + name + "\n" + this.phone.toString());
	}
}
