import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        //OtherMenu.menu();
        menu();
    }

    public static void menu() {
        Scanner parametreUser;
        String userEntry;
        parametreUser = new Scanner(System.in);
        userEntry = "0";
        System.out.println(parametreUser.nextInt() == 1);
        while (!userEntry.equals("1") && !userEntry.equals("2") && !userEntry.equals("3") && !userEntry.equals("4")) {
            showMenu();
            userChoice(userEntry = parametreUser.nextLine());
            if (!userEntry.equals("1") && !userEntry.equals("2") && !userEntry.equals("3") && !userEntry.equals("4")) {
                System.out.println("Vous avez entré un mauvais paramètre");
            }
        }
    }

    public static void showMenu() {
        System.out.println("Veuillez choisir votre paramètre entre :");
        System.out.println("1 Challenger");
        System.out.println("2 Défenseur");
        System.out.println("3 Duel");
        System.out.println("4 Exit");
    }

    public static void userChoice(String choice) {
        if (choice.equals("1")) {
            System.out.println("Vous avez choisi le mode Challenger");
        } else if (choice.equals("2")) {
            System.out.println("Vous avez choisi le mode Défenseur");
        } else if (choice.equals("3")) {
            System.out.println("Vous avez choisi le mode Duel");
        } else if (choice.equals("4")) {
            System.out.println("Au revoir");
        }
    }
}

