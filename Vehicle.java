package assignment;

public class Vehicle {
	private int noOfWheel;
	private int noOfPaasenger;
	private int model;
	private String make;
	
	public Vehicle(int noOfWheel, int noOfPaasenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPaasenger = noOfPaasenger;
		this.model = model;
		this.make = make;
	}
	public void display()
	{
		System.out.println("noOfWheel: "+noOfWheel+" noOfPassenger: "+noOfPaasenger+" model: "+model+" make: "+make);
	}
}
