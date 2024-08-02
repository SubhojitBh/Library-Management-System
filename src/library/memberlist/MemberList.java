package library.memberlist;

import java.util.ArrayList;
import java.util.Date;

public class MemberList {
    private ArrayList<Member> members;
    private int bookLimit;

    public MemberList(int bookLimit) {
        this.members = new ArrayList<>();
        this.bookLimit = bookLimit;
    }

    public void addMember(int memberId, String name, Date dateOfBirth) {
        if (getMemberIndex(memberId) != -1) {
            System.out.println("Member with ID " + memberId + " already exists.");
            return;
        }
        members.add(new Member(memberId, name, dateOfBirth, 0));
    }

    public void displayMember(int memberId) {
        int index = getMemberIndex(memberId);
        if (index == -1) {
            System.out.println("Member with ID " + memberId + " does not exist.");
            return;
        }
        System.out.println(members.get(index));
    }

    public void displayAllMembers() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public boolean canIssueBook(int memberId) {
        int index = getMemberIndex(memberId);
        if (index == -1) {
            System.out.println("Member with ID " + memberId + " does not exist.");
            return false;
        }
        return members.get(index).getBooksIssued() < bookLimit;
    }

    public void updateBooksIssued(int memberId, int change) {
        int index = getMemberIndex(memberId);
        if (index == -1) {
            System.out.println("Member with ID " + memberId + " does not exist.");
            return;
        }
        Member member = members.get(index);
        member.setBooksIssued(member.getBooksIssued() + change);
    }

    private int getMemberIndex(int memberId) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == memberId) {
                return i;
            }
        }
        return -1;
    }
}
