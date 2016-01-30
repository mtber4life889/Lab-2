
public class RebelShip extends Spaceship
{
	private String wings = "";
	private String droid = "";
	
	public RebelShip(String shipName, double maxSpeed)
	{
		setSpaceShipSpecs(shipName, maxSpeed);
	}
	
	public void setRebelWingConfig(String wingConfig)
	{
		wings = wingConfig;
	}
	
	public void setRebelDroidName(String droidName)
	{
		droid = droidName;
	}
	
	//out-dated
	public void setRebelSpecifics(String wingConfig, String droidName)
	{
		wings = wingConfig;
		droid = droidName;
	}
	
	public String getRebelWingConfiguration()
	{
		return wings;
	}
	
	public String getRebelDroidName()
	{
		return droid;
	}
		
	public String firePrimaryWeapon()
	{
		return "ZZaaap!";
	}
	
	public String toString()
	{
		return "Ship Name: " + getSpaceShipName() + "\n" + "Ship Max Speed: " + getSpaceShipMaxSpeed() + "\n" + "Ship Pilot: " + getPilotName() + "\n" + "Ship Shield Status: " + getShieldStatus() + "\n" + "Rebel Ship Wing Configuration: " + getRebelWingConfiguration() + "\n" + "Rebel Ship Astro Droid Name: " + getRebelDroidName();
	}

}