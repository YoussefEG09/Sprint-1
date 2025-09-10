package Ejercicio1_TascaS1;

public class Percussion extends Instruments {

    public Percussion(String name, double price) {
        super(name, price);

    }

    public String play() {
        if (getName() == null || getName().isEmpty()) {
            throw new IllegalArgumentException("Percussion instrument is not valid");
        }
        return "Now, you're playing percussion instrument.";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
