package MetroGuider;

public class Passenger {

	long phoneNumber ;
	private String name ;
	String orgin;
	String destination;
	
	Passenger(){
		super();
	}
	public String toString() {
		return "NAME : "+name+" | "+"ORGIN : "+orgin+" | "+"DESTINATION : "+destination;
	}
	Passenger(String name,String orgin,String destination){
		this.name = name;
		this.orgin = orgin;
		this.destination = destination;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public long getPhoneNumber() {
		return phoneNumber;
	
	}
	
	public void setPhoneNumber(long phoneNumber) {
		
		 this.phoneNumber = phoneNumber;
	}
	
}
