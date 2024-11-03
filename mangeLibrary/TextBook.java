package mangeLibrary;

class TextBook extends Book {
    protected String subject;

    public TextBook(String subject, String title, String author, String isbn) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Môn học: " + subject;
    }
}