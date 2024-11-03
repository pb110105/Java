package mangeLibrary;

class Novel extends Book{
	protected String genre;
	
	public Novel(String title, String author, String isbn, String genre) {
		super(title, author, isbn);
		this.genre = genre;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + "The loai: " + genre;
	}

}
