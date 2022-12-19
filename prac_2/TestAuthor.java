package prac_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author first = new Author("Dostoevskiy","dostoevskiy@gmail.com", 'm');
        System.out.println(first);
        Author second = new Author("Pushkin", 'm');
        System.out.println(second);
    }
}
