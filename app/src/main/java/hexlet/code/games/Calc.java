package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void runGame() {
        var questions = new String[3][];
        for (var i = 0; i < 3; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nWhat is the result of the expression?");
    }

    private static String[] generateGame() {
        int randomNumberOne = Utils.getRandomInt(1, 10);
        int randomNumberTwo = Utils.getRandomInt(1, 10);
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
