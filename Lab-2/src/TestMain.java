
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
		
		//A wrong Imperial Specific
		Advanced.setImperialSubType("sky guy go fly");
		Advanced.setImperialWeaponry("space magic");
		System.out.println("(Testing setImperialSubType + setImperialWeaponry)" + "\n" + "Imperial Ship Subtype: " + Advanced.getImperialSubType() + "\n" + "(Testing getImperialWeaponry)" + "\n" + "Imperial Secondary Weaponry: " + Advanced.getImperialWeaponry() + "\n");
		
		//Imperial Specifics
		Advanced.setImperialSpecifics("fighter", "Force control");
		Starfighter.setImperialSpecifics("fighter", null);
		Bomber.setImperialSpecifics("bomber", "proton bomb");
		Interceptor.setImperialSpecifics("fighter", "quad laser cannons");
		
		//A wrong Rebel Specific
		Ywing.setRebelWingConfig("sideways");
		Ywing.setRebelDroidName("r3-d1");
		System.out.println("(Testing setRebelDroidName + setRebelWingConfiguration)" + "\n" + "Rebel Ship Wing Config: " + Ywing.getRebelWingConfiguration() + "\n" + "(Testing getRebelDroidName)" + "\n" + "Rebel Astro Droid Name: " + Ywing.getRebelDroidName() + "\n");
		
		//Rebel Specifics
		Xwing.setRebelSpecifics("split", "R5-D1");
		Ywing.setRebelSpecifics("fixed", "R3-D9");
		Bwing.setRebelSpecifics("rotating", "R4-D3");
		
		//Imperial ship test
		System.out.println("(Testing toString of Imperial Ship)" + "\n" + Advanced.toString());
		System.out.println("\n" + "(Testing firePrimaryWeapon of Imperial Ship)" + "\n" + Advanced.firePrimaryWeapon());
		
		//Rebel ship test
		System.out.println("\n" + "(Testing toString of Rebel Ship)" + "\n" + Ywing.toString());
		System.out.println("\n" + "(Testing firePrimaryWeapon of Rebel Ship)" + "\n" + Ywing.firePrimaryWeapon());
		
		//
		Spaceship Enterprise;
		Enterprise = new ImperialShip("Enterprise", 10);
		System.out.println("\n" + "(testing polymorphism)" + "\n" + Enterprise.firePrimaryWeapon());
		Enterprise = new RebelShip("Ze Enterprise", 10);
		System.out.println(Enterprise.firePrimaryWeapon());
		
		System.out.println(Starfighter.fireSecondaryWeapon());
		System.out.println(Advanced.fireSecondaryWeapon());

	}

}