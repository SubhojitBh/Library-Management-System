package library.transactionlist;

import java.util.ArrayList;

public class TransactionList {
    private ArrayList<Transaction> transactions;

    public TransactionList() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(int memberId, int bookId) {
        transactions.add(new Transaction(memberId, bookId));
    }

    public void returnBook(int memberId, int bookId) {
        for (Transaction transaction : transactions) {
            if (transaction.getMemberId() == memberId && transaction.getBookId() == bookId) {
                transaction.setMemberId(-1);
                break;
            }
        }
    }

    public void displayTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
