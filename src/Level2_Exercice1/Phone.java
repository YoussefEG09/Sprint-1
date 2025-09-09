package Level2_Exercice1;

public class Phone {
    private String brand;
    private String model;


    public Phone(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void call(String phoneNumber){
        if (phoneNumber == null || phoneNumber.isEmpty()){
            throw new IllegalArgumentException("The phone number is not valid");
        }
        System.out.println("You 're calling to " + phoneNumber);
    }



}
