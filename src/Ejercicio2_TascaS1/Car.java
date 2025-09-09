package Ejercicio2_TascaS1;

public class Car {
    private static final String brand = "Opel";
    private static String model;
    private final double horses;


    //We can make the constructor but only with horses atributte. Because its final but we can modify it.
    public Car(double horses) {
        this.horses = horses;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public double getHorses() {
        return horses;
    }

    public static void brake(){
        System.out.println("The vehicle is braking");
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating");

    }

}
