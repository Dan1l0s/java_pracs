package prac_19;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Metro 2033", "D.Glukhovskiy", 2010, 539);
        System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getYear() + " " + book.getAmount_of_pages());
        book.setName("Metro 2034");
        book.setYear(2011);
        book.setAmount_of_pages(461);
        System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getYear() + " " + book.getAmount_of_pages());
    }
}
