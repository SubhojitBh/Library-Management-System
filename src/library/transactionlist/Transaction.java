package library.transactionlist;

public class Transaction {
    private int memberId;
    private int bookId;

    public Transaction(int memberId, int bookId) {
        this.memberId = memberId;
        this.bookId = bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Transaction [Member ID: " + memberId + ", Book ID: " + bookId + "]";
    }
}
