package book;

public class Fiction extends Book {

    public Fiction(String title) {
        super(title);
        getPrice();
    }

    public void setPrice(double price) {
        price = 24.99;
    }
}


