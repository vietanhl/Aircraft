

public class NoneEngine extends AbstractAirplane implements Flyable {


	public NoneEngine(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String fuelTankCapacity) {
		super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType, fuelTankCapacity);
		fuelType=null;
		fuelTankCapacity =null;
	}
//overriding interface's abstract methods.
	public void dockOut() {
		System.out.println("None engine docks out");
	}

	public void accelerate() {
		System.out.println("None engine accelerates");
	}

	public void ascend() {
		System.out.println("None engine ascend");
	}

	public void descend() {
		System.out.println("None engine descend");
	}

	public void deaccelerate() {
		System.out.println("None engine deaccelerate");
	}

	public void land() {
		System.out.println("None engine land");
	}

	public void dockIn() {
		System.out.println("None engine docks in");
	}


}
