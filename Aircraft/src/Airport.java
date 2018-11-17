import java.util.ArrayList;

public class Airport {

	private String name;
	private String location;

	ArrayList<AbstractAircraft> aircraftArray = new ArrayList<AbstractAircraft>();


	public Airport(String name, String location){
		this.setName(name);
		this.setLocation(name);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
