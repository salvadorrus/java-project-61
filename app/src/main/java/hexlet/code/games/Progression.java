package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {

    public static void runGame() {
        var questions = new String[3][];
        for (var i = 0; i < 3; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nWhat number is missing in the progression?");
    }

    private static String[] generateGame() {
        var count = 10;
        var firstNumber = Utils.getRandomInt(1, 9);
        var step = Utils.getRandomInt(1, 9);
        var hiddenIndex = Utils.getRandomInt(1, 9);
        var progressionQuest = generateProgression(firstNumber, step, count);
        var correctAnswer = progressionQuest[hiddenIndex];
        progressionQuest[hiddenIndex] = "..";
        return new String[]{Arrays.toString(progressionQuest), correctAnswer};
    }

    private static String[] generateProgression(int firstNumber, int step, int count) {
        int nextNumber;
        String[] progression = new String[count];
        progression[0] = String.valueOf(firstNumber);
        for (var i = 1; i < count; i++) {
            nextNumber = firstNumber + step;
            progression[i] = String.valueOf(nextNumber);
            firstNumber += step;
        }
        return progression;
    }
}
