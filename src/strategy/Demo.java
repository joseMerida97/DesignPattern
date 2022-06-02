package strategy;

public class Demo {
    public static void main(String[] args) {
        ISale student = new Student();
        Bookstore bookstore = new Bookstore(student);
        bookstore.sellBook("phisica 1", 45.0);

        ISale professor = new Professor();

        bookstore.setSale(professor);
        bookstore.sellBook("Phisica 2", 60.0);
    }
}
