
public class TestMain {
	
	public static void main(String[] args) {
		
		//Imperial Ships
		ImperialShip Advanced = new ImperialShip("prototype TIE advanced", 8);
		ImperialShip Starfighter = new ImperialShip("TIE Starfighter", 8);
		ImperialShip Bomber = new ImperialShip("TIE Bomber", 5.7);
		ImperialShip Interceptor = new ImperialShip("TIE Interceptor", 8.3);
		
		//Rebel Ships
		RebelShip Xwing = new RebelShip("X-wing", 7);
		RebelShip Ywing = new RebelShip("Y-wing", 6.7);
		RebelShip Bwing = new RebelShip("B-wing", 6.7);
		
		//Imperial Pilots
		Advanced.setPilotName("Darth Vader");
		Starfighter.setPilotName("Dodson Makraven");
		Bomber.setPilotName("Tomax Bren");
		Interceptor.setPilotName("Soontir Fel");
		
		//Rebel Pilots
		Xwing.setPilotName("Garven Dreis");
		Ywing.setPilotName("Keyan Farlander");
		Bwing.setPilotName("Hera Syndulla");
		
		//Imperial Shields
		Advanced.setShieldStatus("down");
		Starfighter.setShieldStatus("up");
		Bomber.setShieldStatus("up");
		Interceptor.setShieldStatus("up");
		
		//Rebel Shields
		Xwing.setShieldStatus("up");
		Ywing.setShieldStatus("down");
		Bwing.setShieldStatus("up");
		
		//Imperial Specifics
		Advanced.setImperialSpecifics("fighter", "Force control");
		Starfighter.setImperialSpecifics("fighter", null);
		Bomber.setImperialSpecifics("bomber", "proton bomb");
		Interceptor.setImperialSpecifics("fighter", "quad laser cannons");
		
		//Rebel Specifics
		Xwing.setRebelSpecifics("split", "R5-D1");
		Ywing.setRebelSpecifics("fixed", "R3-D9");
		Bwing.setRebelSpecifics("rotating", "R4-D3");
		
		System.out.println(Bomber.toString());

	}

}
