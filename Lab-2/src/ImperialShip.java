
public class ImperialShip extends Spaceship
{
	private String type = "";
	private String weaponry = "";
	
	public ImperialShip(String shipName, double maxSpeed)
	{
		setSpaceShipSpecs(shipName, maxSpeed);
	}	
	
	public void setImperialSubType(String subType)
	{
		type = subType;
	}
	
	public void setImperialWeaponry(String secondaryWeaponry)
	{
		weaponry = secondaryWeaponry;
	}
	
	public void setImperialSpecifics(String subType, String secondaryWeaponry)
	{
		type = subType;
		weaponry = secondaryWeaponry;
	}
	
	//outdated
	public String getImperialSpecifics()
	{
		return type + weaponry;
	}
	
	public String getImperialSubType()
	{
		return type;
	}
	
	public String getImperialWeaponry()
	{
		return weaponry;
	}
	
	public String firePrimaryWeapon()
	{
		return "Pkchew!";
	}
	
	public String fireSecondaryWeapon()
	{
		return "Firing Imperial Ships Secondary Weaponry!!";
	}
	
	public String toString()
	{
		return "Ship Name: " + getSpaceShipName() + "\n" + "Ship Max Speed: " + getSpaceShipMaxSpeed() + "\n" + "Ship Pilot: " + getPilotName() + "\n" + "Ship Shield Status: " + getShieldStatus() + "\n" + "Imperial Ship SubType: " + getImperialSubType() + "\n" + "Imperial Secondary Weaponry: " + getImperialWeaponry();
	}

}