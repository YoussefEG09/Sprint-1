package Level2_Exercice1;

public class Main {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Apple", "16 Pro Max");

        phone1.call("697740427");
        phone1.alarm();
        phone1.photograph();
        System.out.println("Your model's phone is : "+phone1.getModel());
        System.out.println("Your brand's phone is : " + phone1.getBrand());
    }
}
