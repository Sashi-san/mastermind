import java.util.Random;
import java.util.Scanner;

public class GameMode {

    private static final int MODE_CHALLENGER = 1;
    private static final int MODE_DEFENSEUR = 2;
    private static final int MODE_DUEL = 3;

    private static int secretNumber;
    private static int userNumber;
    private static String userStringNumber;

    public static void challenger() {
        generateNumber();
        showSecretNumber();
        playGame(getUserNumber());
        gameOver();
    }

    private static void generateNumber() {
        Random random = new Random();
        secretNumber=5223;
        /*secretNumber = random.nextInt();
        if (secretNumber<0){
            secretNumber=secretNumber*-1;
        }
        secretNumber=secretNumber%10000;*/
    }

    private static int getUserNumber() {
        Scanner clavier = new Scanner(System.in);
        userStringNumber=clavier.nextLine();
        return 0;
    }

    private static void showSecretNumber() {
        System.out.println("Combinaison secrète :" + secretNumber);
    }

    private static void playGame(int userNumber) {

    }

    private static void gameOver() {

    }
}
