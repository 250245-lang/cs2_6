import java.util.ArrayList;
import java.util.List;

class Library {
    private int id;
    private String name;
    private Librarian librarian;
    private List<Member> members;
    private List<Book> books;

    public Library() {
        members = new ArrayList<>();
        books = new ArrayList<>();
    }
}

class Librarian {
    private int id;
    private String name;
    private long contactNo;
    private Library library;
    private List<Member> managedMembers;
    private List<Book> managedBooks;

    public Librarian() {
        managedMembers = new ArrayList<>();
        managedBooks = new ArrayList<>();
    }

    public void addLibrarian() {
    }

    public int updateInfo() {
        return 0;
    }

    public int removeLibrarian(int id) {
        return 0;
    }

    public int login(String uname, String pass) {
        return 0;
    }
}

class Book {
    private int bookID;
    private String bookName;
    private double price;
    private String author;
    private String publication;
    private Member issuedTo;

    public void addBook() {
    }

    public int updatebook() {
        return 0;
    }

    public int removeLibrarian(int bookID) {
        return 0;
    }

    public void issueBook(int bookID) {
    }

    public void returnBook(int bookID) {
    }
}

class Member {
    String mName;
    long mContact;
    String mType;
    private int mNoOfBookIssued;
    private List<Book> issuedBooks;

    public Member() {
        issuedBooks = new ArrayList<>();
    }

    public void addMember() {
    }

    public int udateMember() {
        return 0;
    }

    public void issueBook(int bookID) {
    }

    public void returnBook(int bookID) {
    }

    public void registration() {
    }

    public int authentication(int mID) {
        return 0;
    }
}

class Staff extends Member {
    private int mID;
    private String name;
}

class Student extends Member {
    private int enrNo;
    private String name;

    public int payFine() {
        return 0;
    }
}
