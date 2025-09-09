package Ejercicio1_TascaS1;

public class Main {

    public static void main(String[] args) {
        Wind Flute = new Wind("Jesus Flute", 5000);
        Strings Guitar = new Strings("Paco de Lucia's guitar", 800000);
        Percussion Bongo = new Percussion("Bongo", 40);


        System.out.println(Flute.play() + Flute);
        System.out.println(Guitar.play() + Guitar);
        System.out.println(Bongo.play() + Bongo);
    }

    }

