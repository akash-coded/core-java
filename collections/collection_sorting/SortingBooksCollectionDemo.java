package collections.collection_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book implements Comparable<Book> {
    int id;
    String name;
    String author;
    String publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Book b) {
        if (this.id < b.id) { // descending order
            return 1;
        } else if (this.id > b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BookComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        if (b1.quantity > b2.quantity) { // ascending order
            return 1;
        } else if (b1.quantity < b2.quantity) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class SortingBooksCollectionDemo {
    public static void main(String[] args) {
        // Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);

        System.out.println("Before sorting:: ");
        bookList.forEach(
                b -> System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity));

        Collections.sort(bookList, new BookComparator());
        System.out.println("After sorting:: ");
        bookList.forEach(
                b -> System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity));
    }
}
