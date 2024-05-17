package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    public static void runGame() {
        Engine.run(Engine.roundCounter(generateGame()),
                "\nWhat is the result of the expression?");
    }

    private static String[] generateGame() {
        Random random = new Random();
        int randomNumberOne = random.nextInt(20);
        int randomNumberTwo = random.nextInt(20);
        String[] operator = {"+", "-", "*"};
        int sign = random.nextInt(3);
        var calculation = randomNumberOne + " " + operator[sign] + " " + randomNumberTwo;
        var correctAnswer = calculationGame(calculation);
        return new String[]{calculation, correctAnswer};
    }

    private static String calculationGame(String calculation) {
        var calculationTask = calculation.split(" ");
        var numberOne = calculationTask[0];
        var numberTwo = calculationTask[2];
        var signTask = calculationTask[1];
        int result;
        switch (signTask) {
            case "+":
                result = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);
                break;
            case "-":
                result = Integer.parseInt(numberOne) - Integer.parseInt(numberTwo);
                break;
            case "*":
                result = Integer.parseInt(numberOne) * Integer.parseInt(numberTwo);
                break;
            default:
                throw new RuntimeException("unknown operation");
        }
        return Integer.toString(result);
    }
}
