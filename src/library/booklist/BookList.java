package library.booklist;

import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> books;

    public BookList() {
        this.books = new ArrayList<>();
    }

    public void addBook(int bookId, String title, int totalCopies) {
        if (getBookIndex(bookId) != -1) {
            System.out.println("Book with ID " + bookId + " already exists.");
            return;
        }
        books.add(new Book(bookId, title, totalCopies, totalCopies));
    }

    public void updateCopies(int bookId, int additionalCopies) {
        int index = getBookIndex(bookId);
        if (index == -1) {
            System.out.println("Book with ID " + bookId + " does not exist.");
            return;
        }
        Book book = books.get(index);
        book.setTotalCopies(book.getTotalCopies() + additionalCopies);
        book.setAvailableCopies(book.getAvailableCopies() + additionalCopies);
    }

    public void displayBook(int bookId) {
        int index = getBookIndex(bookId);
        if (index == -1) {
            System.out.println("Book with ID " + bookId + " does not exist.");
            return;
        }
        System.out.println(books.get(index));
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public int getBookIndex(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                return i;
            }
        }
        return -1;
    }
}
