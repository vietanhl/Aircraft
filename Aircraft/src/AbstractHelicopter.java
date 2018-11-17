
public abstract class AbstractHelicopter extends AbstractAircraft{

	private String cruisingDistance;
	public AbstractHelicopter(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType,String cruisingDistance) {
		super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType);
		this.cruisingDistance=cruisingDistance;

	}
	public String getCruisingDistance() {
		return cruisingDistance;
	}
	public void setCruisingDistance(String cruisingDistance) {
		this.cruisingDistance = cruisingDistance;
	}
	@Override
	public String toString() {
		return super.toString() + "\nCruising Distance: " + cruisingDistance;
	}


}
