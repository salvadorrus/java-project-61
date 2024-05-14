package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {

    public static void runGame() {
        var questions = new String[3][];
        for (var i = 0; i < 3; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions, "\nFind the greatest common divisor of given numbers.");
    }

    private static String[] generateGame() {
        Random random = new Random();
        int randomNumberOne = random.nextInt(100);
        int randomNumberTwo = random.nextInt(100);
        var calculation = randomNumberOne + " " + randomNumberTwo;
        var correctAnswer = calculationGame(calculation);
        return new String[]{calculation, correctAnswer};
    }

    private static String calculationGame(String calculation) {
        var calculationGcd = calculation.split(" ");
        var numberOne = Integer.parseInt(calculationGcd[0]);
        var numberTwo = Integer.parseInt(calculationGcd[1]);
        while (numberOne != numberTwo) {
            if (numberOne > numberTwo) {
                numberOne = numberOne - numberTwo;
            } else {
                numberTwo = numberTwo - numberOne;
            }
        }
        return Integer.toString(numberOne);
    }
}
