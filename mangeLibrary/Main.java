package mangeLibrary;

public class Main {
	public static void main(String [] args) {
		Library library = new Library();
		library.addBook(new TextBook("C# Programming", "John Doe", "1101", "Programming"));
		library.addBook(new Novel("The Great Gastby", "Hamster", "1102", "Genz"));
		Member member = new Member("PhamBao", "Mo1");
		System.out.println(member.getMembershipDetails());
		
		library.borrowBook("1101");
		library.listBooks();
		library.returnBook("1102");
		library.listBooks();
		
		
	}

}
