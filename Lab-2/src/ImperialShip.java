
public class ImperialShip extends Spaceship
{
	private String type = "";//holds Imperial ship subtype
	private String weaponry = "";//holds Imperial ship secondary weaponry
	
	//constructor
	public ImperialShip(String shipName, double maxSpeed)
	{
		setSpaceShipSpecs(shipName, maxSpeed);
	}	
	
	//Used to set the Imperial ship subtype
	public void setImperialSubType(String subType)
	{
		type = subType;
	}
	
	//Used to set the Imperial ship secondary weapons
	public void setImperialWeaponry(String secondaryWeaponry)
	{
		weaponry = secondaryWeaponry;
	}
	
	//Used to set both the Imperial ships subtype and secondary weapons at once
	public void setImperialSpecifics(String subType, String secondaryWeaponry)
	{
		type = subType;
		weaponry = secondaryWeaponry;
	}
	
	//Used to get the Imperial ship subtype
	public String getImperialSubType()
	{
		return type;
	}
	
	//Used to get the Imperial ship secondary weaponry
	public String getImperialWeaponry()
	{
		return weaponry;
	}
	
	//Used to fire the Imperial ships primary weapon
	public String firePrimaryWeapon()
	{
		return "Firing Imperial Ships Primary Weapon!!" + "\n" + "Pkchew!";
	}
	
	//Used to fire the Imperial ships secondary weaponry
	public String fireSecondaryWeapon()
	{
		if(weaponry != null && weaponry != "")
		{
			return "Firing " + getSpaceShipName() + "'s Secondary Weaponry!!";
		}
		else
		{
			return getSpaceShipName() + " has no Secondary Weaponry!!";
		}
		
	}
	
	//Used to push useful info about an Imperial Ship to a string to be printed to console
	public String toString()
	{
		return "Ship Name: " + getSpaceShipName() + "\n" + "Ship Max Speed: " + getSpaceShipMaxSpeed() + "\n" + "Ship Pilot: " + getPilotName() + "\n" + "Ship Shield Status: " + getShieldStatus() + "\n" + "Imperial Ship SubType: " + getImperialSubType() + "\n" + "Imperial Secondary Weaponry: " + getImperialWeaponry();
	}

}