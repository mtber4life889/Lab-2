// http://stackoverflow.com/questions/18140964/return-different-type-of-data-from-a-method-in-java

public abstract class Spaceship 
{
	private String name;
	private double speed;
	private String pilot;
	private String status;
	
	
	public Spaceship()
	{
		name = "";
		speed = 0;
	}
	
	public Spaceship(String shipName, double maxSpeed)
	{
		name = shipName;
		speed = maxSpeed;
	}

	public void setSpaceShipSpecs(String shipName, double maxSpeed)
	{
		name = shipName;
		speed = maxSpeed;
		// http://stackoverflow.com/questions/18140964/return-different-type-of-data-from-a-method-in-java
	}
	
	public void setSpaceShipSpeed(double maxSpeed)
	{
		speed = maxSpeed;
	}
	
	public void setSpaceShipName(String shipName)
	{
		name = shipName;
	}
	public String getSpaceShipName()
	{
		return name;
	}
	
	public double getSpaceShipMaxSpeed()
	{
		return speed;
	}
	
	public void setPilotName(String pilotName)
	{
		pilot = pilotName;
	}
	
	public String getPilotName()
	{
		return pilot;
	}
	
	public void setShieldStatus(String shieldStatus)
	{
		status = shieldStatus;
	}
	
	public String getShieldStatus()
	{
		return status;
	}
	
	abstract public String firePrimaryWeapon();
	
	public String toString()
	{
		return "Ship Name: " + name + "\n" + "Ship Max Speed: " + speed + "\n" + "Ship Pilot: " + pilot + "\n" + "Shield Status: " + status;
	}

}