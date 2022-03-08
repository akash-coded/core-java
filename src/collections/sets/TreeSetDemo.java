package src.collections.sets;

import java.util.TreeSet;
import java.util.Comparator;

class Book implements Comparable<Book> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
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

class ImplComparator implements Comparator<Book> {
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

public class TreeSetDemo {
    public static void main(String[] args) {
        Comparator<Book> obj = new ImplComparator();

        TreeSet<Book> set = new TreeSet<>(obj);

        // Creating Books
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

        set.add(b1);
        set.add(b2);
        set.add(b3);

        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
