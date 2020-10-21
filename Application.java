package assignment;
import java.util.*;
public class Application {
	public static void main(String[] args) {
		Vehicle v;
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice : 1.vehicle,2.car,3.convertible,4.sportcar");
		choice=s.nextInt();
		if(choice==1)
		{
			v=new Vehicle(2,2,56,"indian");
			v.display();
		}
		if(choice==2)
		{
			v=new Car(4,4,56,"indian",4);
			v.display();
		}
		if(choice==3)
		{
			v=new Convertible(4,4,56,"indian",4,true);
			v.display();
		}
		if(choice==4)
		{
			v=new SportCar(4,4,56,"indian",6);
			v.display();
		}
	}
}
