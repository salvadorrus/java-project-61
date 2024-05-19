package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

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
        Random random = new Random();
        var count = 10;
        var firstNumber = random.nextInt(9) + 1;
        var step = random.nextInt(9) + 1;
        var hiddenIndex = random.nextInt(9);
        var progressionQuest = generateProgression(firstNumber, step, count, hiddenIndex);
        String progression = progressionQuest[0];
        String correctAnswer = progressionQuest[1];
        return new String[]{progression, correctAnswer};
    }

    private static String[] generateProgression(int firstNumber, int step, int count, int hiddenIndex) {
        String hiddenNumber;
        int nextNumber;
        var progression = new String[count];
        progression[0] = String.valueOf(firstNumber);
        for (var i = 1; i < count; i++) {
            nextNumber = firstNumber + step;
            progression[i] = String.valueOf(nextNumber);
            firstNumber += step;
        }
        hiddenNumber = progression[hiddenIndex];
        progression[hiddenIndex] = "..";
        return new String[]{Arrays.toString(progression), hiddenNumber};
    }
}
