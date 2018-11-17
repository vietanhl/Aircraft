
public abstract class AbstractAircraft {

	private int id;
	private String name;
	private String model;
	private int age;

	public airStatus aircraftStatus;
	public enum airStatus{FUELING, DOCKOUT, ACCELERATING, TAKEOFF, ASCENDING, FLYING, DESCENDING, LANDING, DESACCELERATING, DOCKIN};

	public runStatus runWayStatus;
	public enum runStatus{OCCUPIED,FREE};

	public dockPos dockingPosition;
	public enum dockPos{A001A, B002B, C003C, D004D, E005E};

	public fuelT fuelTypes;
	public enum fuelT{UNLEADED_KEROSENE, AVGAS_82_UL, AVGAS_100, AVGAS_100_LL};





	public AbstractAircraft(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType) {
	this.id=id;
	this.age=age;
	this.name=name;
	this.model=model;
	this.aircraftStatus=aircraftStatus;
	this.runWayStatus=runWayStatus;
	this.dockingPosition=dockingPosition;
	this.fuelTypes=fuelType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public airStatus getAircraftStatus() {
		return aircraftStatus;
	}

	public void setAircraftStatus(airStatus aircraftStatus) {
		this.aircraftStatus = aircraftStatus;
	}

	public runStatus getRunWayStatus() {
		return runWayStatus;
	}

	public void setRunWayStatus(runStatus runWayStatus) {
		this.runWayStatus = runWayStatus;
	}

	public dockPos getDockingPosition() {
		return dockingPosition;
	}

	public void setDockingPosition(dockPos dockingPosition) {
		this.dockingPosition = dockingPosition;
	}

	public fuelT getFuelTypes() {
		return fuelTypes;
	}

	public void setFuelTypes(fuelT fuelTypes) {
		this.fuelTypes = fuelTypes;
	}

	@Override
	public String toString() {
		return   name  + "\nID: " + id + "\nModel: " + model + "\nAge: " + age ;
	}



}
