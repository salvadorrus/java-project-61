package hexlet.code;


import java.util.Scanner;

public class Cli {

    public static String scannName;


    static void greet() {

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inputName = new Scanner(System.in);
        scannName = inputName.nextLine();
        System.out.println("Hello, " + scannName + "!");
    }

    public static void correct() {
        System.out.println("Correct!");
    }

    public static void congratulations() {
        System.out.println("Congratulations, " + scannName + "!");
    }

    public static void wrongAnswerYes() {
        System.out.println("'yes' is wrong answer ;(. "
                + "Correct answer was 'no'. Let's try again, " + scannName + "!");
    }

    public static void wrongAnswerNo() {
        System.out.println("'no' is wrong answer ;(. "
                + "Correct answer was 'yes'. Let's try again, " + scannName + "!");
    }

    public static void end() {
        System.out.println("Game over!");
    }
}




