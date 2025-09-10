package Ejercicio1_TascaS1;

public abstract class Instruments {
    private String name;
    private final double price;

    public Instruments(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name= '" + name + '\'' +
                ", price= " + price + "$";
    }

    public abstract String play();

}



