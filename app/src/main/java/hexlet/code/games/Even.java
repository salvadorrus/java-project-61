package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Engine.MIN_RANDOM_NUMBER;
import static hexlet.code.Engine.RANDOM_NUMBER;

public class Even {

    public static void runGame() {
        var questions = new String[ROUND_COUNT][];
        for (var i = 0; i < ROUND_COUNT; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[] generateGame() {
        var randomNumber = Utils.getRandomInt(MIN_RANDOM_NUMBER, RANDOM_NUMBER);
        var correctAnswer = isEven(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}

