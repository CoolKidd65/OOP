package teeshirt;

public class DemoTee {
    public static void main(String[] args) {

        Teeshirt t1 = new Teeshirt();
        t1.setNumber(23101703);
        t1.setSize("S");
        t1.setColor("Black");

        Teeshirt t2 = new Teeshirt();
        t2.setNumber(23101704);
        t2.setSize("XXXL");
        t2.setColor("Red");

        CustomTee c1 = new CustomTee();
        c1.setNumber(23101705);
        c1.setSize("L");
        c1.setColor("White");
        c1.setSlogan("League of Legends");
        
        CustomTee c2 = new CustomTee();
        c2.setNumber(23101706);
        c2.setSize("XXL");
        c2.setColor("Blue");
        c2.setSlogan("Fortnite");

        System.out.println("Number: " + t1.getNumber());
        System.out.println("Size: " + t1.getSize());
        System.out.println("Color: " + t1.getColor());
        System.out.println("Price: $" + t1.getPrice() + "\n");
        
        System.out.println("Number: " + t2.getNumber());
        System.out.println("Size: " + t2.getSize());
        System.out.println("Color: " + t2.getColor());
        System.out.println("Price: $" + t2.getPrice() + " \n");
        
        System.out.println("Number: " + c1.getNumber());
        System.out.println("Size: " + c1.getSize());
        System.out.println("Color: " + c1.getColor());
        System.out.println("Price: $" + c1.getPrice());
        System.out.println("Slogan: " + c1.getSlogan() + "\n");
        
        System.out.println("Number: " + c2.getNumber());
        System.out.println("Size: " + c2.getSize());
        System.out.println("Color: " + c2.getColor());
        System.out.println("Price: $" + c2.getPrice());
        System.out.println("Slogan: " + c2.getSlogan() + "\n");
    }
}
