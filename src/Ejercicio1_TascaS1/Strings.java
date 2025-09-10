package Ejercicio1_TascaS1;

public class Strings extends Instruments {

    public Strings (String name, double price){
        super(name, price);

    }

    public String play(){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("String instrument is not valid");
        }
        return "Now you're playing a string instrument.";
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
