package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Engine.MIN_RANDOM_NUMBER;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;

public class Calc {

    public static void runGame() {
        var questions = new String[ROUND_COUNT][];
        for (var i = 0; i < ROUND_COUNT; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nWhat is the result of the expression?");
    }

    private static String[] generateGame() {
        int randomNumberOne = Utils.getRandomInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        int randomNumberTwo = Utils.getRandomInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        int randomSign = Utils.getRandomInt(0, 2);
        char[] operator = {'+', '-', '*'};
        char sign = operator[randomSign];
        var calculation = randomNumberOne + " " + sign + " " + randomNumberTwo;
        var correctAnswer = calculationGame(randomNumberOne, randomNumberTwo, sign);
        return new String[]{calculation, String.valueOf(correctAnswer)};
    }

    private static int calculationGame(int numberOne, int numberTwo, char sign) {
        int result;
        switch (sign) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo;
                break;
            default:
                throw new RuntimeException("unknown operation");
        }
        return result;
    }
}
