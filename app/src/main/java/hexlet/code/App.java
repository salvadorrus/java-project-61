package hexlet.code;

import hexlet.code.Games.Calc;
import hexlet.code.Games.Even;
import hexlet.code.Games.Gcd;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choiceGame;
        choiceGame = gamesMenu();
        switch (choiceGame) {
            case 0:
                System.out.println("\nThanks for playing, goodbye!");
                break;
            case 1:
                Engine.greeting();
                break;
            case 2:
                Engine.greeting();
                Even.runGame();
                break;
            case 3:
                Engine.greeting();
                Calc.runGame();
                break;
            case 4:
                Engine.greeting();
                Gcd.runGame();
            default:
                break;
        }
    }

    public static int gamesMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Gcd");
        System.out.println("0 - Exit");
        var choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        return choice;
    }
}



