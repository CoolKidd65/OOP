package book;

public class UseBook {

    public static void main(String[] args) {

        Fiction fiction1 = new Fiction("Book 1");
        NonFiction nfiction1 = new NonFiction("NBook 1");

        System.out.println("Title: " + fiction1.getTitle());
        System.out.println("Price: $" + fiction1.getPrice());

        System.out.println("Title: " + nfiction1.getTitle());
        System.out.println("Price: $" + nfiction1.getPrice());
    }
}
