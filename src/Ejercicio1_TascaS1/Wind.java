package Ejercicio1_TascaS1;

public class Wind extends Instruments {

    public Wind(String name, double price) {
        super(name, price);


    }

    public String play() {
        if (getName() == null || getName().isEmpty()){
            throw new IllegalArgumentException("Wind instrument is not valid");
        }
        return "You're playing a wind instrument.";
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
