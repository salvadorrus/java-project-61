package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUND_COUNT = 3;
    public static final int RANDOM_NUMBER = 100;
    public static final int MAX_RANDOM_NUMBER = 20;
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int LENGTH_PROGRESSION = 10;

    public static void run(String[][] questions, String rules) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var scannName = scanner.nextLine();
        System.out.println("Hello, " + scannName + "!");
        System.out.println(rules);
        for (var question : questions) {
            System.out.println("Question: " + question[0]);
            String userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(question[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer"
                        + " was '" + question[1] + "'. Let's try again, " + scannName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + scannName + "!");
    }
}




