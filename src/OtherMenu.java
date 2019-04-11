import java.util.Scanner;

public class OtherMenu {

    private static final int MODE_MAIN_MENU = 1;
    private static final int MODE_SUB_MENU_PLAY = 2;
    private static final int MODE_SUB_MENU_OPTION = 3;
    private static final int MODE_QUIT = 4;

    private static int mode;

    public static void menu() {
        mode = MODE_MAIN_MENU;

        while (!(mode == MODE_QUIT)) {
            displayChoice();
            String input = getInput();
            applyChoice(input);
        }
    }

    private static void displayChoice() {
        switch (mode) {
            case MODE_MAIN_MENU:
                displayMainMenu();
                break;
            case MODE_SUB_MENU_PLAY:
                displaySubPlay();
                break;
            case MODE_SUB_MENU_OPTION:
                displaySubOption();
                break;
            default:
                System.out.println("Erreur: mode d'affichage inconnu");
                break;
        }
    }

    private static void displayMainMenu() {
        System.out.println("Menu principal : ");
        System.out.println("1 - Jouer");
        System.out.println("2 - Option");
        System.out.println("3 - Quitter");
        System.out.print('\n');
    }

    private static void displaySubOption() {
        System.out.println("Option : ");
        System.out.println("1 - Retour");
        System.out.print('\n');
    }

    private static void displaySubPlay() {
        System.out.println("Choisissez votre mode de jeu : ");
        System.out.println("1 - Challenger");
        System.out.println("2 - Defenseur");
        System.out.println("3 - Duel");
        System.out.println("4 - Retour");
        System.out.print('\n');
    }


    private static String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static void applyChoice(String input) {
        switch (mode) {
            case MODE_MAIN_MENU:
                applyMainMenu(input);
                break;
            case MODE_SUB_MENU_PLAY:
                applySubPlay(input);
                break;
            case MODE_SUB_MENU_OPTION:
                applySubOption(input);
                break;
            default:
                System.out.println("Erreur: mode d'application inconnu");
                break;
        }
    }

    private static void applyMainMenu(String input) {
        if (input.equals("1")) {
            mode = MODE_SUB_MENU_PLAY;
        } else if (input.equals("2")) {
            mode = MODE_SUB_MENU_OPTION;
        } else if (input.equals("3")) {
            System.out.println("A bientot !");
            mode = MODE_QUIT;
        } else {
            System.out.println("Parametre incorrect");
        }
        System.out.print('\n');
    }

    private static void applySubPlay(String input) {
        if (input.equals("1")) {
            System.out.println("Vous jouez au mode Challenger");
            GameMode.challenger();
        } else if (input.equals("2")) {
            System.out.println("Vous jouez au mode Defenseur");
        } else if (input.equals("3")) {
            System.out.println("Vous jouez au mode Duel");
        } else if (input.equals("4")) {
            mode = MODE_MAIN_MENU;
        } else {
            System.out.println("Parametre incorrect");
        }
        System.out.print('\n');
    }

    private static void applySubOption(String input) {
        if (input.equals("1")) {
            mode = MODE_MAIN_MENU;
        } else {
            System.out.println("Parametre incorrect");
        }
        System.out.print('\n');
    }
}
