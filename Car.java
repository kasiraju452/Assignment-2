package assignment;

public class Car extends Vehicle{
	private int noOfDoor;
	public Car(int noOfWheel, int noOfPaasenger, int model, String make,int noOfDoor)
	{
		super(noOfWheel,noOfPaasenger,model,make);
		this.noOfDoor=noOfDoor;
	}
	public void setNoOfDoors(int noOfDoor)
	{
		this.noOfDoor=noOfDoor;
	}
	public int getNoOfDoors()
	{
		return noOfDoor;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("noOfDoor: "+getNoOfDoors());
	}
}
