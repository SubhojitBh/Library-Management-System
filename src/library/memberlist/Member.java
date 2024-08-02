package library.memberlist;

import java.util.Date;

public class Member {
    private int memberId;
    private String name;
    private Date dateOfBirth;
    private int booksIssued;

    public Member(int memberId, String name, Date dateOfBirth, int booksIssued) {
        this.memberId = memberId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.booksIssued = booksIssued;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }

    @Override
    public String toString() {
        return "Member ID: " + memberId + ", Name: " + name + ", Date of Birth: " + dateOfBirth + ", Books Issued: " + booksIssued;
    }
}
