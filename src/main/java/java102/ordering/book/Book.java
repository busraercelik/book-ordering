package java102.ordering.book;

public class Book implements Comparable<Book>{

    private String bookTitle;
    private String author;
    private int noOfPages;
    private String publishDate;

    public Book(String bookTitle, String author, int noOfPages, String publishDate) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.noOfPages = noOfPages;
        this.publishDate = publishDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    @Override
    public int compareTo(Book o) {
        return -o.getBookTitle().compareTo(this.bookTitle); //reversed sorting
    }


}
