import library.booklist.BookList;
import library.memberlist.MemberList;
import library.transactionlist.TransactionList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        BookList bookList = new BookList();
        MemberList memberList = new MemberList(3);
        TransactionList transactionList = new TransactionList();

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add new book");
            System.out.println("2. Add more copies of a book");
            System.out.println("3. Show all book details");
            System.out.println("4. Show details of a book");
            System.out.println("5. Add new member");
            System.out.println("6. Show all members");
            System.out.println("7. Show details of a member");
            System.out.println("8. Issue a book");
            System.out.println("9. Return a book");
            System.out.println("10. Display all transactions");
            System.out.println("11. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter total copies: ");
                    int totalCopies = scanner.nextInt();
                    bookList.addBook(bookId, title, totalCopies);
                    break;
                case 2:
                    System.out.print("Enter book ID: ");
                    bookId = scanner.nextInt();
                    System.out.print("Enter additional copies: ");
                    int additionalCopies = scanner.nextInt();
                    bookList.updateCopies(bookId, additionalCopies);
                    break;
                case 3:
                    bookList.displayAllBooks();
                    break;
                case 4:
                    System.out.print("Enter book ID: ");
                    bookId = scanner.nextInt();
                    bookList.displayBook(bookId);
                    break;
                case 5:
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date of birth (yyyy-MM-dd): ");
                    String dob = scanner.nextLine();
                    Date dateOfBirth = dateFormat.parse(dob);
                    memberList.addMember(memberId, name, dateOfBirth);
                    break;
                case 6:
                    memberList.displayAllMembers();
                    break;
                case 7:
                    System.out.print("Enter member ID: ");
                    memberId = scanner.nextInt();
                    memberList.displayMember(memberId);
                    break;
                case 8:
                    System.out.print("Enter member ID: ");
                    memberId = scanner.nextInt();
                    System.out.print("Enter book ID: ");
                    bookId = scanner.nextInt();
                    if (memberList.canIssueBook(memberId) && bookList.getBookIndex(bookId) != -1) {
                        transactionList.addTransaction(memberId, bookId);
                        memberList.updateBooksIssued(memberId, 1);
                        bookList.updateCopies(bookId, -1);
                    } else {
                        System.out.println("Cannot issue book.");
                    }
                    break;
                case 9:
                    System.out.print("Enter member ID: ");
                    memberId = scanner.nextInt();
                    System.out.print("Enter book ID: ");
                    bookId = scanner.nextInt();
                    transactionList.returnBook(memberId, bookId);
                    memberList.updateBooksIssued(memberId, -1);
                    bookList.updateCopies(bookId, 1);
                    break;
                case 10:
                    transactionList.displayTransactions();
                    break;
                case 11:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
