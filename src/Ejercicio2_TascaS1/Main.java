package Ejercicio2_TascaS1;

public class Main {

    public static void main(String[] args) {

        //Calling the static method.
        Car.brake();

        //Calling the no static method.
        Car car1 = new Car(363);
        car1.accelerate();


    }
}
