
public class RebelShip extends Spaceship
{
	private String wings = "";//holds Rebel ship wing configuration
	private String droid = "";//holds Rebel ship Astromech droid name
	
	//constructor
	public RebelShip(String shipName, double maxSpeed)
	{
		setSpaceShipSpecs(shipName, maxSpeed);
	}
	
	//Used to set a Rebel Ships wing configuration
	public void setRebelWingConfig(String wingConfig)
	{
		wings = wingConfig;
	}
	
	//Used to set a Rebel Ships Astromech droids name
	public void setRebelDroidName(String droidName)
	{
		droid = droidName;
	}
	
	//Used to set both the Rebel ships wing configuration and Astromech droids name at once
	public void setRebelSpecifics(String wingConfig, String droidName)
	{
		wings = wingConfig;
		droid = droidName;
	}
	
	//Used to get a Rebel Ships wing configuration
	public String getRebelWingConfiguration()
	{
		return wings;
	}
	
	//Used to get a Rebel Ships Astromech droids Name
	public String getRebelDroidName()
	{
		return droid;
	}
		
	//Used to fire a Rebel Ships primary weapons
	public String firePrimaryWeapon()
	{
		return "Firing Rebel Ships Primary Weapon!!" + "\n" + "ZZaaap!";
	}
	
	//Used to push useful info about a Rebel Ship to a string to be printed to console
	public String toString()
	{
		return "Ship Name: " + getSpaceShipName() + "\n" + "Ship Max Speed: " + getSpaceShipMaxSpeed() + "\n" + "Ship Pilot: " + getPilotName() + "\n" + "Ship Shield Status: " + getShieldStatus() + "\n" + "Rebel Ship Wing Configuration: " + getRebelWingConfiguration() + "\n" + "Rebel Ship Astro Droid Name: " + getRebelDroidName();
	}

}