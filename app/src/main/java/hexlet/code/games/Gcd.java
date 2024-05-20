package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    public static void runGame() {
        var questions = new String[3][];
        for (var i = 0; i < 3; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nFind the greatest common divisor of given numbers.");
    }

    private static String[] generateGame() {
        int randomNumberOne = Utils.getRandomInt(1, 100);
        int randomNumberTwo = Utils.getRandomInt(1, 100);
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
