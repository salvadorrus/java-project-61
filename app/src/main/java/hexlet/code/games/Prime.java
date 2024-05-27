package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Utils.MIN_RANDOM_NUMBER;
import static hexlet.code.Utils.MAX_RANDOM_NUMBER;

public class Prime {

    public static void runGame() {
        var questions = new String[ROUND_COUNT][];
        for (var i = 0; i < ROUND_COUNT; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nAnswer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[] generateGame() {
        var randomNumber = Utils.getRandomInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER) + 1;
        var correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isPrime(int randomNumber) {
        for (var i = 2; i < randomNumber / 2; i++) {
            var result = randomNumber % i;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }
}
