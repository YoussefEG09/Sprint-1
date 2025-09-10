package Level3_TascaS1;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int option;

    public void callMenu() {

        option = scanner.nextInt();
        scanner.nextLine();

        while (option != 0)
            System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Add journalist");
        System.out.println("2. Remove journalist");
        System.out.println("3. Add news article to a journalist");
        System.out.println("4. Remove news article (requires journalist and article title)");
        System.out.println("5. Show all news articles by journalist");
        System.out.println("6. Calculate article score");
        System.out.println("7. Calculate article price");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
        switch (option) {
            case 1 -> addWriter();
            break;

            case 2:
                deleteWriter();
                break;

            case 3:
                Writer writer;
                SportsNews sportnew;
                writer.addNews(sportnew);
                break;
            case 0:
                (option = 0);
        }





    }


    private void addWriter () {
        System.out.println("Introduce writer's id please : ");
        String id = scanner.nextLine();


    }


    private void deleteWriter () {
        System.out.println("Introduce writer's id please : ");
        String id = scanner.nextLine();
    }

    private void addNewsToWriter (){
        System.out.println("Enter writer's ID : ");

    }

    private void removeNewsToWriter (){

    }

    private void showAllNewsByWriter (){

    }




}
