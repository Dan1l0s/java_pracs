package prac_19;

public class Book {
    private String author;
    private String name;
    private int year;
    private int amount_of_pages;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getAmount_of_pages() {
        return amount_of_pages;
    }
    public void setAmount_of_pages(int amount_of_pages) {
        this.amount_of_pages = amount_of_pages;
    }
    Book(String name, String author, int year, int amount_of_pages)
    {
        this.amount_of_pages = amount_of_pages;
        this.name = name;
        this.author = author;
        this.year = year;
    }

}
