package Lab2;

import java.util.Scanner;

public class BookStoreApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore bs = new BookStore();
		System.out.println("Enter 1 to display books");
		System.out.println("Enter 2 to order new books");
		System.out.println("Enter 3 to sell books");
		System.out.println("Enter 0 to exit");

		while (true) {
			System.out.print("Enter input: ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				bs.display();
				break;
			case 2:
				bs.sell("Ways of life", 1);
				break;
			case 3:
				bs.order("45355", 2);
				break;
			default:
				return;
			}
		}
	}
}
