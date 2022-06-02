package strategy;

public class Bookstore {
    private ISale sale;

    public Bookstore(ISale sale) {
        this.sale = sale;
    }

    public void setSale(ISale sale) {
        this.sale = sale;
    }

    public void sellBook(String bookName, double bookPrice) {
        if (sale.sell(bookPrice)) {
            System.out.println(bookName + " sold!");
        }
    }
}
