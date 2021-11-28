package book.ordering;

import java.util.Comparator;
import java.util.TreeSet;

public class AppRunner {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        getBooks(books);

//        sorts the book by name from A to Z.
        for (Book b: books) {
            System.out.println(b.getBookTitle());
        }

        System.out.println("#######################");

//        sorts the books by the number of pages.
        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNoOfPages()-o2.getNoOfPages();
            }
        });
        getBooks(books2);

        for (Book book: books2) {
            System.out.println(book.getBookTitle());
        }

    }

    public static TreeSet<Book> getBooks(TreeSet<Book> books) {
        books.add(new Book("1984","George Orwell",328, "1949"));
        books.add(new Book("To Kill a Mockingbird","Harper Lee",281, "1960"));
        books.add(new Book("Jane Eyre","Charlotte Brontë ",380, "1847"));
        books.add(new Book("Animal Farm","George Orwell",112, "1945"));
        books.add(new Book("Moby Dick","Herman Melville",140, "1851"));

        return books;
    }
}
