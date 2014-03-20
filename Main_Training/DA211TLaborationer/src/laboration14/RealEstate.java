package laboration14;

public class RealEstate {
	String name;
	Building building;
	Address address;
	
	public RealEstate(String name, Building building, Address address){
		this.address = address;
		this.building = building;
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setBuilding(Building building){
		this.building = building;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	public String getName(){
		return name;
	}
	
	public Building getBuilding(){
		return this.building;
	}
	
	public Address getAddress(){
		return this.address;
	}
	
	public String toString(){
		return ("Fastighet: " + name + "\nByggnad: " + building + "\nAddress: " + address);
	}
}
