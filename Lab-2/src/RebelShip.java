
public class RebelShip extends Spaceship
{
	private String wings = "";
	private String droid = "";
	
	public RebelShip(String shipName, double maxSpeed)
	{
		setSpaceShipSpecs(shipName, maxSpeed);
	}
	
	public void setRebelSpecifics(String wingConfig, String droidName)
	{
		wings = wingConfig;
		droid = droidName;
	}
		
	public String firePrimaryWeapon()
	{
		return "ZZaaap!";
	}
	
	public String toString()
	{
		return wings + "" + droid;
	}

}
