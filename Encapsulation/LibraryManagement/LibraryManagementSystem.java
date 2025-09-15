package LibraryManagement;
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        setItemId(itemId);
        setTitle(title);
        setAuthor(author);
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        if (itemId <= 0) {
            this.itemId = 1;
        } else {
            this.itemId = itemId;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            this.author = "Unknown";
        } else {
            this.author = author;
        }
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            borrower = borrowerName;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            borrower = borrowerName;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrower;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            reserved = true;
            borrower = borrowerName;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem i1 = new Book(301, "Java Programming", "James Gosling");
        LibraryItem i2 = new Magazine(302, "Tech Today", "Editorial Team");
        LibraryItem i3 = new DVD(303, "Inception", "Christopher Nolan");

        LibraryItem[] items = { i1, i2, i3 };

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable res = (Reservable) item;
                System.out.println("Available: " + res.checkAvailability());
                res.reserveItem("John Doe");
                System.out.println("Available after reservation: " + res.checkAvailability());
            }
            System.out.println("----------------------------");
        }
    }
}

