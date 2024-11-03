package mangeLibrary;

import java.util.List;
import java.util.ArrayList;

class Library {
	private List<Book> books = new ArrayList();

	public void addBook(Book book) {
		books.add(book);
	}

	public void borrowBook(String isbn) {
		for (Book book : books) {
			if (book.isbn.equals(isbn) && book.isAvailable) {
				book.borrow();
				break;
			}
		}
	}

	public void returnBook(String isbn) {
		for (Book book : books) {
			if (book.isbn.equals(isbn)) {
				book.returnBook();
				break;
			}
		}
	}

	public void listBooks() {
		for (Book book : books) {
			System.out.println(book.getInfo());
			
		}
	}

}
