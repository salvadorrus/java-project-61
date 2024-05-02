package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {

    public static void gameEven() {
        System.out.println("\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scann = new Scanner(System.in);
        String scannQuestion;
        Random rand = new Random();

        var question = 0;
        for (var i = 1; i <= 3;) {
            int randomNumber = rand.nextInt(100);
            System.out.println("Question: " + randomNumber);
            scannQuestion = scann.nextLine();
            System.out.println("Your answer: " + scannQuestion);

            if ((randomNumber % 2 == 0 && scannQuestion.equals("yes"))
                    || (randomNumber % 2 != 0 && scannQuestion.equals("no"))) {
                Cli.correct();
                question++;
                i++;
                if (question == 3) {
                    Cli.congratulations();
                }

            } else if (randomNumber % 2 != 0 && scannQuestion.equals("yes")) {
                Cli.wrongAnswerYes();
                Cli.end();
                break;

            } else if (randomNumber % 2 == 0 && scannQuestion.equals("no")) {
                Cli.wrongAnswerNo();
                Cli.end();
                break;
            }

        }


    }
}
