package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;


public class Even {

    public static void runGame() {
        var questions = new String[3][];
        for (int i = 0; i < 3; i++) {
            questions[i] = generateQuestions();
        }
        Engine.run(questions, "\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static String[] generateQuestions() {
        var randomNumber = new Random().nextInt(100);
        var correctAnswer = isEven(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}

