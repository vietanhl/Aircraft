
public class GolfStream extends AbstractJet implements Flyable, Fuelable {


	private String golfStreamType;
	public GolfStream(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String golfStreamType) {
	super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType);
		this.setGolfStreamType(golfStreamType);
	}

	@Override
	public void calcFuel() {
		System.out.println("Golf stream calc fuel");

	}

	@Override
	public void getFuel() {
		System.out.println("Golf stream fuel");

	}

	@Override
	public void dockOut() {
		System.out.println("Golf stream docks out");

	}

	@Override
	public void accelerate() {
		System.out.println("Golf stream accelerates");

	}

	@Override
	public void ascend() {
		System.out.println("Golf stream ascends");

	}

	@Override
	public void descend() {
		System.out.println("Golf stream descends");

	}

	@Override
	public void deaccelerate() {
		System.out.println("Golf stream deaccelerates");

	}

	@Override
	public void land() {
		System.out.println("Golf stream lands");

	}

	@Override
	public void dockIn() {
		System.out.println("Golf stream docks in");

	}

	public String getGolfStreamType() {
		return golfStreamType;
	}

	public void setGolfStreamType(String golfStreamType) {
		this.golfStreamType = golfStreamType;
	}

}
