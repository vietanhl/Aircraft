

public class TwinEngineAirplan extends AbstractAircraft implements Flyable, Fuelable{

	public TwinEngineAirplan(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String fuelTankCapacity){
	super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType);
	}

	public void dockOut() {
		System.out.println("Twin Engine Air plan docks out");

	}

	public void accelerate() {
		System.out.println("Twin Engine Air plan accelerates");

	}

	@Override
	public void ascend() {
		System.out.println("Twin Engine Air plan ascends");

	}

	@Override
	public void descend() {
		System.out.println("Twin Engine Air plan descends");

	}

	@Override
	public void deaccelerate() {
		System.out.println("Twin Engine Air plan deaccelerates");

	}

	@Override
	public void land() {
		System.out.println("Twin Engine Air plan lands");

	}

	@Override
	public void dockIn() {
		System.out.println("Twin Engine Air plan docks in");

	}


	@Override
	public void calcFuel() {
		System.out.println("Twin Engine Air plan caluclates fuel");

	}

	@Override
	public void getFuel() {
		System.out.println("Twin Engine Air plan fuel");

	}



}
