package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Engine.MIN_RANDOM_NUMBER;
import static hexlet.code.Engine.RANDOM_NUMBER;

public class Gcd {

    public static void runGame() {
        var questions = new String[ROUND_COUNT][];
        for (var i = 0; i < ROUND_COUNT; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nFind the greatest common divisor of given numbers.");
    }

    private static String[] generateGame() {
        int randomNumberOne = Utils.getRandomInt(MIN_RANDOM_NUMBER, RANDOM_NUMBER);
        int randomNumberTwo = Utils.getRandomInt(MIN_RANDOM_NUMBER, RANDOM_NUMBER);
        var calculation = randomNumberOne + " " + randomNumberTwo;
        var correctAnswer = calculationGame(randomNumberOne, randomNumberTwo);
        return new String[]{calculation, String.valueOf(correctAnswer)};
    }

    private static int calculationGame(int numberOne, int numberTwo) {
        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;
            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        return numberOne;
    }
}
