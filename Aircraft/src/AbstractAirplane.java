

public abstract class AbstractAirplane extends AbstractAircraft {


	private String fuelTankCapacity;

	public AbstractAirplane(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String fuelTankCapacity) {
		super(age, model, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType);
		this.fuelTankCapacity=fuelTankCapacity;
	}

	public String getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public void setFuelTankCapacity(String fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public String toString() {
		return super.toString() + "\nfuel Tank Capacity: " + fuelTankCapacity;

	}

}
