package mangeLibrary;


abstract class Book {
	protected String title;
	protected String author;
	protected String isbn;
	protected boolean isAvailable;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = true;
	}
	public void borrow() {
		isAvailable = false;
	}
	public void returnBook() {
		isAvailable = true;
	}
	public String getInfo() {
		return ("Thong tin sach:"
				+ "Tua de:  " + title +
				" Tac gia: " + author + 
				" ISBN : " + isbn +
				"Tinh trang: " + isAvailable);
	}
}
