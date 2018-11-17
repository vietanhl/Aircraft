

public class SingleEngineAirplan extends AbstractAirplane implements Flyable, Fuelable {

	public SingleEngineAirplan(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String fuelTankCapacity) {
		super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType, fuelTankCapacity);

	}

	public void dockOut() {
		System.out.println("Single Engine Air plan docks out");
	}

	public void accelerate() {
		System.out.println("Single Engine Air accelerate");
	}

	public void ascend() {
		System.out.println("Single Engine Air ascends");
	}

	public void descend() {
		System.out.println("Single Engine Air descends");
	}

	public void deaccelerate() {
		System.out.println("Single Engine Air deccelerates");
	}

	public void land() {
		System.out.println("Single Engine Air lands");
	}

	public void dockIn() {
		System.out.println("Single Engine Air docks in");
	}

	@Override
	public void calcFuel() {
		System.out.println("Single Engine Air plan calculates fuel");

	}

	@Override
	public void getFuel() {
		System.out.println("Single Engine Air plan fuel");

	}


}
