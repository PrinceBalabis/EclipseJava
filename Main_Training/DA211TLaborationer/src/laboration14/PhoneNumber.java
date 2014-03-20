package laboration14;

public class PhoneNumber {
	private String home, work, mobile;
	
	public PhoneNumber(String home, String work, String mobile){
		this.home = home;
		this.work = work;
		this.mobile = mobile;
	}
	
	public void setHome(String home){
		this.home = home;
	}
	
	public void setWork(String work){
		this.work = work;
	}
	
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	
	public String getHome(){
		return home;
	}
	
	public String getWork(){
		return work;
	}
	
	public String getMobile(){
		return mobile;
	}
	
	public String toString(){
		return ("Home:	"+ home + "\n" + "Work:	"+ work + "\n" + "Mobile:	" + mobile);
	}
}
