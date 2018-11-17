
public class SirkorSky extends AbstractHelicopter implements Flyable, Fuelable{
	private String sirkorSkyType;
	public SirkorSky(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType,String cruisingDistance, String sirkorSkyType) {
		super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType, cruisingDistance);
		this.setSirkorSkyType(sirkorSkyType);
	}

	@Override
	public void calcFuel() {
		System.out.println("Sirkor Sky calculates fuel");

	}

	@Override
	public void getFuel() {
		System.out.println("Sirkor Sky fuel");

	}

	@Override
	public void dockOut() {
		System.out.println("Sirkor Sky docks out");

	}

	@Override
	public void accelerate() {
		System.out.println("Sirkor Sky accelerates");

	}

	@Override
	public void ascend() {
		System.out.println("Sirkor Sky ascends");

	}

	@Override
	public void descend() {
		System.out.println("Sirkor Sky descends");

	}

	@Override
	public void deaccelerate() {
		System.out.println("Sirkor Sky deaccelerates");

	}

	@Override
	public void land() {
		System.out.println("Sirkor Sky lands");

	}

	@Override
	public void dockIn() {
		System.out.println("Sirkor Sky docks in");

	}

	public String getSirkorSkyType() {
		return sirkorSkyType;
	}

	public void setSirkorSkyType(String sirkorSkyType) {
		this.sirkorSkyType = sirkorSkyType;
	}



}
