package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String scannName;

    static void greeting() {

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inputName = new Scanner(System.in);
        scannName = inputName.nextLine();
        System.out.println("Hello, " + scannName + "!");
    }

    public static void run(String[][] questions, String rules) {
        System.out.println(rules);
        Scanner scann = new Scanner(System.in);
        for (var question : questions) {
            System.out.println("Question: " + question[0]);
            String userAnswer = scann.next();
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




