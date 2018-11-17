

public class Apache extends AbstractHelicopter implements Flyable, Fuelable{
	private String apacheType;
	public Apache(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType,String cruisingDistance, String apacheType) {
		super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType, cruisingDistance);
		this.apacheType=apacheType;
	}
	public String getApacheType() {
		return apacheType;
	}
	public void setApacheType(String apacheType) {
		this.apacheType = apacheType;
	}
	@Override
	public void calcFuel() {
		System.out.println("Apache calculates fuel");

	}
	@Override
	public void getFuel() {
		System.out.println("Apache fuel");

	}
	@Override
	public void dockOut() {
		System.out.println("Apache docks in");

	}
	@Override
	public void accelerate() {
		System.out.println("Apache accelerates");

	}
	@Override
	public void ascend() {
		System.out.println("Apache ascends");

	}
	@Override
	public void descend() {
		System.out.println("Apache descends");

	}
	@Override
	public void deaccelerate() {
		System.out.println("Apache deaccelerates");

	}
	@Override
	public void land() {
		System.out.println("Apache lands");

	}
	@Override
	public void dockIn() {
		System.out.println("Apache docks in");

	}


}
