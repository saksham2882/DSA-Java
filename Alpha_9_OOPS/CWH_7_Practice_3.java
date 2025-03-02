package Alpha_9_OOPS;

class Book {
    int price;
    static int count;                         // This is common for all the objects.

    public Book(int price) {
        this.price = price;
        count++;
    }
}
public class CWH_7_Practice_3 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        System.out.println("Book Price:");

        System.out.println(Book.count);         // As count is static so we access it with class name also.
        Book b1 = new Book(150);
        System.out.println(Book.count);
        Book b2 = new Book(250);
        System.out.println(Book.count);
    }
}
