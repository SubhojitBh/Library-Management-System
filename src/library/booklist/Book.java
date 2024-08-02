package library.booklist;

public class Book {
    private int bookId;
    private String title;
    private int totalCopies;
    private int availableCopies;

    public Book(int bookId, String title, int totalCopies, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.totalCopies = totalCopies;
        this.availableCopies = availableCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Total Copies: " + totalCopies + ", Available Copies: " + availableCopies;
    }
}
