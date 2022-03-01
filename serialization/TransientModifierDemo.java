package serialization;

import java.io.*;

class Book implements Serializable {
    private static final long serialVersionUID = -2936687026040726549L;
    private String bookName;
    private String description;
    private transient int copies;
    static String publisher = "Wiley"; // static fields are not part of state of the object, there is no use/impact of
                                       // using transient keyword with static variables
    private final transient String bookCategory = "Fiction"; // transient keyword has no effect on final variable
                                                             // because final variables are directly serialized with
                                                             // their values

    public String getBookName() {
        return bookName;
    }

    public void setBookName(final String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(final int copies) {
        this.copies = copies;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public static void serialize(final Book book, final String filePath) throws Exception {
        final FileOutputStream file = new FileOutputStream(filePath);
        final ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(book);
        out.close();
        file.close();
    }

    public static Book deserialize(final String filePath) throws Exception {
        final FileInputStream file = new FileInputStream(filePath);
        final ObjectInputStream in = new ObjectInputStream(file);
        final Book book = (Book) in.readObject();
        in.close();
        file.close();
        return book;
    }

    @Override
    public String toString() {
        return "Book [bookCategory=" + bookCategory + ", bookName=" + bookName + ", copies=" + copies + ", description="
                + description + ", publisher="
                + publisher + "]";
    }
}

public class TransientModifierDemo {

    public static void main(final String[] args) throws Exception {
        final Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("Better than Chetan Bhagat novels");
        book.setCopies(25);
        System.out.println("Book details before serialization::\n" + book);

        Book.serialize(book, "serialization/my_book.txt");
        System.out.println("Book persisted!");

        final Book retrievedBook = Book.deserialize("serialization/my_book.txt");
        System.out.println("Book de-persisted!");
        System.out.println("Book details after deserialization::\n" + retrievedBook);
    }
}
