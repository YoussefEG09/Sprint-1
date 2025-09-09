package TascaS1;

public class Strings extends Instruments {

    public Strings (String name, double price){
        super(name, price);

    }

    public String play(){
        return "Now you're playing a string instrument.";
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
