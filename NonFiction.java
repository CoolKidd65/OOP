package book;

public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        getPrice();
    }

    public void setPrice(double price) {
        price = 37.99;
    }
}