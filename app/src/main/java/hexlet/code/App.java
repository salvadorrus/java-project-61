package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choiceGame;
        choiceGame = gamesMenu();
        switch (choiceGame) {
            case 0:
                System.out.println("Thanks for playing, goodbye.");
                break;
            case 1:
                Cli.greet();
                break;
            case 2:
                Cli.greet();
                Even.gameEven();
                break;
            default:
                break;
        }
    }

    public static int gamesMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        int choice;
        choice = scanner.nextInt();
        System.out.print("Your choice: " + choice);
        return choice;
    }
}



