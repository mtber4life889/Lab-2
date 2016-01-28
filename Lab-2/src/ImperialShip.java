
public class ImperialShip extends Spaceship
{
	private String type = "";
	private String weaponry = "";
	
	public ImperialShip(String shipName, double maxSpeed)
	{
		setSpaceShipSpecs(shipName, maxSpeed);
	}
	
	public void setImperialSpecifics(String subType, String secondaryWeaponry)
	{
		type = subType;
		weaponry = secondaryWeaponry;
	}
	
	public String getImperialSpecifics(String subType, String secondaryWeaponry)
	{
		return type + weaponry;
	}
	
	public String firePrimaryWeapon()
	{
		return "Pkchew!";
	}
	
	/*public String toString()
	{
		return null;
	}*/

}
