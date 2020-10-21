package Lab2;

import Lab2.Book;

public class BookStore extends Book {
	
	Book books[] = {new Book("Ways of life", "John abe", "45355", 12),
			new Book("Java ", "Herbert Schildt", "45356", 4) };

	public void sell(String bookTitle, int noOfCopies) {
		boolean b = false;
		for (int i = 0; i < books.length; i++) {
			if ((books[i].getBookTitle() == bookTitle) && noOfCopies <= books[i].getNumOfCopies()) {
				b = true;
				int copies = books[i].getNumOfCopies() - noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false)
			System.out.println("Book not found..");
	}

	public void order(String isbn, int noOfCopies) {
		boolean b = false;
		for (int i = 0; i < books.length; i++) {
			if (books[i].getISBN() == isbn) {
				b = true;
				int copies = books[i].getNumOfCopies() + noOfCopies;
				books[i].setNumOfCopies(copies);
			}
		}
		if (b == false) {
			System.out.println("New Book is added....");
		}
	}

	public void display() {
		for (int i = 0; i < books.length; i++) {
			books[i].display();
		}
	}

}
