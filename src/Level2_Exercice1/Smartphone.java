package Level2_Exercice1;

public class Smartphone extends Phone implements Camera, Watch{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }


    @Override
    public void photograph() {
        System.out.println("You're taking a picture");
    }

    @Override
    public void alarm() {
        System.out.println("RINGGGG RIIIINGG !!!!! WAKE UP");
    }
}
