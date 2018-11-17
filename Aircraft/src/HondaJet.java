
public class HondaJet extends AbstractJet implements Flyable, Fuelable{
	private String hondaJetType;
	public HondaJet(int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String hondaJetType) {
		super(id, name, model, age, aircraftStatus, runWayStatus, dockingPosition, fuelType);
		this.setHondaJetType(hondaJetType);
	}

	@Override
	public void calcFuel() {
		System.out.println("Honda jet calculates fuel");

	}

	@Override
	public void getFuel() {
		System.out.println("Honda jet fuel");

	}

	@Override
	public void dockOut() {
		System.out.println("Honda jet docks out");

	}

	@Override
	public void accelerate() {
		System.out.println("Honda jet accelerates");

	}

	@Override
	public void ascend() {
		System.out.println("Honda jet ascends");

	}

	@Override
	public void descend() {
		System.out.println("Honda jet descends");

	}

	@Override
	public void deaccelerate() {
		System.out.println("Honda jet deaccelerates");

	}

	@Override
	public void land() {
		System.out.println("Honda jet lands");

	}

	@Override
	public void dockIn() {
		System.out.println("Honda jet docks in");

	}

	public String getHondaJetType() {
		return hondaJetType;
	}

	public void setHondaJetType(String hondaJetType) {
		this.hondaJetType = hondaJetType;
	}



}
