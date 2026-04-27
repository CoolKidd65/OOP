package teeshirt;

public class Teeshirt {
    private int number;
    private String size;
    private String color;
    private double price;

    public Teeshirt () {
    	this.number = 0;
    	this.size = "";
    	this.color = "";
    	this.price = 0.0;
    }
    
    public Teeshirt (int number, String size, String color, float price) {
    	this.number = number;
    	this.size = size;
    	this.color = color;
    	this.price = price;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public void setSize(String size) {
        this.size = size;
        setPrice(); 
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice() {
        if (size.equalsIgnoreCase("XXL") || size.equalsIgnoreCase("XXXL")) {
            price = 22.99;
        } else {
            price = 19.99;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}
