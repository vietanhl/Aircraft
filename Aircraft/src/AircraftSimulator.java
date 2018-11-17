import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AircraftSimulator {

	public static void main(String[] args) {
		ArrayList<AbstractAircraft> aircraft = new ArrayList<>();
		//Aeroplane -- fix order of the name...
		//int id, String name, String model, int age, airStatus aircraftStatus, runStatus runWayStatus, dockPos dockingPosition, fuelT fuelType, String fuelTankCapacity)
		//AbstractAircraft noneEngine1 = new NoneEngine(100, "Glider", "test", 25,  , "No fuel capacity","_001A", "Fuelling");
//		AbstractAircraft nonEngine2= new NoneEngine(1001, "nonE name", "none e model", 22, AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.FREE, AbstractAircraft.dockPos.A001A, AbstractAircraft.fuelT.AVGAS_100, "100L");
		AbstractAircraft singleEngine1 = new SingleEngineAirplan(101, "Test single engine", "single model", 23, AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.OCCUPIED, AbstractAircraft.dockPos.B002B, AbstractAircraft.fuelT.AVGAS_100_LL, "200L");
		AbstractAircraft twinEngine1 = new TwinEngineAirplan(102, "Test twin", "Twin model", 22,AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.FREE, AbstractAircraft.dockPos.C003C, AbstractAircraft.fuelT.AVGAS_82_UL, "400L");
		//jet
		AbstractAircraft hondaJet1 = new HondaJet(103, "Test honda", "honda model", 24, AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.OCCUPIED, AbstractAircraft.dockPos.D004D, AbstractAircraft.fuelT.UNLEADED_KEROSENE, "300L");
		AbstractAircraft golfStream1 =  new GolfStream(104, "golf stream", "golf model", 11, AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.FREE, AbstractAircraft.dockPos.E005E, AbstractAircraft.fuelT.AVGAS_82_UL, "100L");
		//helicopter
		AbstractAircraft apache1 = new Apache(105, "Apache", "apache model", 14, AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.FREE, AbstractAircraft.dockPos.D004D, AbstractAircraft.fuelT.UNLEADED_KEROSENE, "300L" ,"apache Type");
		AbstractAircraft sirkorSky1 = new SirkorSky(106, "sirkor sky", "sirkor sky model", 10,AbstractAircraft.airStatus.FUELING, AbstractAircraft.runStatus.OCCUPIED, AbstractAircraft.dockPos.B002B, AbstractAircraft.fuelT.AVGAS_100, "150L", "sirkorSky Type");

//		aircraft.add(nonEngine2);
		aircraft.add(singleEngine1);
		aircraft.add(twinEngine1);
		aircraft.add(hondaJet1);
		aircraft.add(golfStream1);
		aircraft.add(apache1);
		aircraft.add(sirkorSky1);
		System.out.println(findStatus(aircraft,"apache") + "apache");
		System.out.println(findStatus(aircraft,"sirkor sky")+"sirkor");
		int option;
		String menu = "1. List Aircrafts Status \n2. Find an Aircraft \n3. Operate an Aircraft \n4. Admin the Aircraft Simulator \n5. Exit Aircraft simulator";

		//		boolean success=false;
		//		while(!success){
		try {
			do {
				option = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch(option){
				case 1: JOptionPane.showMessageDialog(null,"List aircrafts status selected");
				displayStatus(aircraft);

				break;
				case 2: String name = JOptionPane.showInputDialog(null, "Find an Aircraft selected. Please type the aircraft you wish to find");
				if (findAircraft(aircraft, name) != -1){
					JOptionPane.showMessageDialog(null, (aircraft.get(findAircraft(aircraft, name))));

				} else {
					JOptionPane.showMessageDialog(null, "Aircraft cannot be found");
				}
				break;
				case 3: String airName = JOptionPane.showInputDialog("Operate an Aircraft selected. Please enter the aircraft you wish to operate");
				if (findAircraft(aircraft, airName) !=-1 ){//user exists
					// EDIT HERE ===============
					if (findStatus(aircraft, airName) !=-1){
						
						//AbstractAircraft.runStatus.class.get;
						//airName.setRunWayStatus(AbstractAircraft.runStatus.OCCUPIED);
						
						//occupyAircraft(aircraft, airName);}}
				//				System.out.println(occupyAircraft(aircraft,airName));
				break;}}
				case 4: JOptionPane.showMessageDialog(null, "Admin the Aircraft Simulator selected");

				break;
				case 5: JOptionPane.showMessageDialog(null," Exit Aircraft simulator");
				break;
				default: JOptionPane.showMessageDialog(null, "Number must be bettwen 1-5. Please try again.");
				break;
				}}while(option != 5);}
		//success=true;}
		catch  (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Input must be a number. Please try again" );

		}}
	//}


	// == EDIT HERE?
	public static void occupyAircraft(ArrayList<AbstractAircraft> aircraft, String airName) {


		//				if (findStatus(aircraft, airName) !=-1){
		for (AbstractAircraft c : aircraft){
			//if(findStatus(aircraft,airName)!=-1 ){
			//if (c.getName().equalsIgnoreCase(airName)){
			//&& (c.getName().equalsIgnoreCase(airName))
			
			System.out.println(c.getName() + c.getRunWayStatus());
			c.setRunWayStatus(AbstractAircraft.runStatus.OCCUPIED);
			System.out.println(c.getName()+ c.getRunWayStatus());
			
			JOptionPane.showMessageDialog(null, airName + "is now operated by you. Other users will not be able to occupy this now.");
			break;}}
	//				} else{
	//					JOptionPane.showMessageDialog(null, "Sorry, " + airName + " is already occupied");
	//			}
	//			else {
	//				JOptionPane.showMessageDialog(null, "Aircraft does not exist");
	//			}
	//		}





	//finding whether the aircraft is FREE/OCCUPIED -- seems to work
	public static int findStatus(ArrayList<AbstractAircraft> aircraft, String name){

		for (AbstractAircraft craft : aircraft) {
			if (craft.getName().equalsIgnoreCase(name)){
				if(craft.getRunWayStatus().equals(AbstractAircraft.runStatus.FREE)){
					//craft.setRunWayStatus(AbstractAircraft.runStatus.OCCUPIED);
					System.out.println(craft.getRunWayStatus() + "test");
					return aircraft.indexOf(craft);
				}


				//return or break will have the same effects here
			}
		}
		return -1;
	}







	public static int findAircraft(ArrayList<AbstractAircraft> aircraft, String name){
		for (AbstractAircraft craft : aircraft) {
			if (craft.getName().equalsIgnoreCase(name)){
				return aircraft.indexOf(craft);
				//return or break will have the same effects here
			}
		}
		//if cannot find employee
		return -1;

	}
	public static void displayStatus(ArrayList<AbstractAircraft> aircraft){
		for (AbstractAircraft craft : aircraft){

			JOptionPane.showMessageDialog(null,(craft.getName()+" "+craft.getRunWayStatus()));
		}
	}

}
