package assignment;

public class SportCar extends Car{
	private int noOfDoor;
	public int getNoOfDoor() {
		return noOfDoor;
	}
	public SportCar(int noOfWheel, int noOfPaasenger, int model, String make,int noOfDoor) {
		super(noOfWheel, noOfPaasenger, model, make,noOfDoor);
		setNoOfDoors(2);
	}
	@Override
	public void display()
	{
		super.display();
	}
}
