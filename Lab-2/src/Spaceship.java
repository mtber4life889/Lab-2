// http://stackoverflow.com/questions/18140964/return-different-type-of-data-from-a-method-in-java

public abstract class Spaceship 
{
	private String name;//holds ship name
	private double speed;//holds max speed
	private String pilot;//holds pilot name
	private String status;//holds shield status
	
	//Default constructor
	public Spaceship()
	{
		name = "";
		speed = 0;
	}
	
	//Constructor
	public Spaceship(String shipName, double maxSpeed)
	{
		name = shipName;
		speed = maxSpeed;
	}

	//Used in ImperialShip and RebelShip to simplify the constructors
	public void setSpaceShipSpecs(String shipName, double maxSpeed)
	{
		name = shipName;
		speed = maxSpeed;
		// http://stackoverflow.com/questions/18140964/return-different-type-of-data-from-a-method-in-java
	}
	
	//Used to set a Spaceships Max Speed
	public void setSpaceShipSpeed(double maxSpeed)
	{
		speed = maxSpeed;
	}
	
	//Used to set a Spaceships Name
	public void setSpaceShipName(String shipName)
	{
		name = shipName;
	}
	
	//Used to get a Spaceships name value 
	public String getSpaceShipName()
	{
		return name;
	}
	
	//Used to get a Spaceships speed value
	public double getSpaceShipMaxSpeed()
	{
		return speed;
	}
	
	//Used to set a Spaceships pilots name
	public void setPilotName(String pilotName)
	{
		pilot = pilotName;
	}
	
	// Used to get a Spaceships pilot value
	public String getPilotName()
	{
		return pilot;
	}
	
	//Used to set a Spaceships shield status
	public void setShieldStatus(String shieldStatus)
	{
		status = shieldStatus;
	}
	
	//Used to get Spaceships shield status
	public String getShieldStatus()
	{
		return status;
	}
	
	//Used to fire a Spaceships primary weapon
	//It's an abstract method because Imperials and Rebels 
	//use different coloured lasers
	abstract public String firePrimaryWeapon();
	
	//Used to push useful info about a Spaceship to a string to be printed to console
	public String toString()
	{
		return "Ship Name: " + name + "\n" + "Ship Max Speed: " + speed + "\n" + "Ship Pilot: " + pilot + "\n" + "Shield Status: " + status;
	}

}