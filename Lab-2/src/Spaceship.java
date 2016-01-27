
public abstract class Spaceship 
{
	protected String Name;
	protected double Speed;
	private String Pilot;
	private String Status;
	
	
	public Spaceship()
	{
		Name = "";
		Speed = 0;
	}
	
	public Spaceship(String shipName, double maxSpeed)
	{
		Name = shipName;
		Speed = maxSpeed;
	}

	public void setSpaceShipSpecs(String shipName, double maxSpeed)
	{
		Name = shipName;
		Speed = maxSpeed;
		// http://stackoverflow.com/questions/18140964/return-different-type-of-data-from-a-method-in-java
	}
	
	public String getSpaceShipSpecs()
	{
		return Name + " " + Speed;
	}
	
	public void setPilotName(String pilotName)
	{
		Pilot = pilotName;
	}
	
	public String getPilotName()
	{
		return Pilot;
	}
	
	public void setShieldStatus(String shieldStatus)
	{
		Status = shieldStatus;
	}
	
	public String getShieldStatus()
	{
		return Status;
	}
	
	abstract public String firePrimaryWeapon();
	
	public String toString()
	{
		return "Ship Name: " + Name + "\n" + "Ship Max Speed: " + Speed + "\n" + "Ship Pilot: " + Pilot + "\n" + "Shield Status: " + Status;
	}

}
