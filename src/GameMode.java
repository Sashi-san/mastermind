import java.util.Random;
import java.util.Scanner;

public class GameMode {

    private static final int MODE_CHALLENGER = 1;
    private static final int MODE_DEFENSEUR = 2;
    private static final int MODE_DUEL = 3;

    private static int secretNumber;
    private static int userNumber;
    private static String userStringNumber;
    private static int life = 5;
    private static boolean result = false;

    public static void challenger() {
        generateNumber();
        while (life > 0 || !result) {
            showSecretNumber();
            playGame(getUserNumber());
        }
        gameOver();
    }

    private static void generateNumber() {
        Random random = new Random();
        random.nextInt();
        secretNumber = 5223;
        //todo faire en sorte que cela est aléatoire dans un tableau.
        /*secretNumber = random.nextInt();
        if (secretNumber<0){
            secretNumber=secretNumber*-1;
        }
        secretNumber=secretNumber%10000;*/
    }

    private static void showSecretNumber() {
        System.out.println("Combinaison secrète :" + secretNumber);
    }

    private static int getUserNumber() {
        Scanner clavier = new Scanner(System.in);
        userStringNumber = clavier.nextLine();
        userNumber = Integer.valueOf(userStringNumber);
        System.out.println();
        return userNumber;
    }

    private static void playGame(int userNumber) {
     int secretNumberTab[]={0,0,0,0};
     int userNumberTab[]={0,0,0,0};


    }

    private static void gameOver() {
        if (life == 0) {
            System.out.println("Dommage, le nombre secret était le 5223");
        } else if (result) {
            System.out.println("Bravo! Vous avez trouvé le nombre secret!");
        }
        System.out.println("Voulez vous recommencer ou quitter?");
        System.out.println("1 - Recommencer");
        System.out.println("2 - Quitter");
    }

    private static String intToString(int userNumber) {
        userStringNumber = String.valueOf(userNumber);
        return userStringNumber;
    }

    private static int stringToInt(String userStringNumber) {
        userNumber = Integer.valueOf(userStringNumber);
        return userNumber;
    }
}
