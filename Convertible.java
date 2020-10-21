package assignment;

public class Convertible extends Car{
	private boolean isHoodOpen;
	public Convertible(int noOfWheel, int noOfPaasenger, int model, String make,int noOfDoor,boolean isHoodOpen)
	{
		super(noOfWheel,noOfPaasenger,model,make,noOfDoor);
		this.isHoodOpen=isHoodOpen;
	}
	public boolean isHoodOpen() {
		return isHoodOpen;
	}
	public void setPhd(boolean isHoodOpen) {
		this.isHoodOpen = isHoodOpen;
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("is hood open: "+isHoodOpen);
	}
}
