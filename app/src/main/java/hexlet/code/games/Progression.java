package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ROUND_COUNT;
import static hexlet.code.Engine.MIN_RANDOM_NUMBER;
import static hexlet.code.Engine.MAX_RANDOM_NUMBER;
import static hexlet.code.Engine.LENGTH_PROGRESSION;

public class Progression {

    public static void runGame() {
        var questions = new String[ROUND_COUNT][];
        for (var i = 0; i < ROUND_COUNT; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nWhat number is missing in the progression?");
    }

    private static String[] generateGame() {
        //var count = LENGTH_PROGRESSION;
        var firstNumber = Utils.getRandomInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var step = Utils.getRandomInt(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        var hiddenIndex = Utils.getRandomInt(MIN_RANDOM_NUMBER, LENGTH_PROGRESSION - 1);
        var progressionQuest = generateProgression(firstNumber, step);
        var correctAnswer = progressionQuest[hiddenIndex];
        progressionQuest[hiddenIndex] = "..";
        String question = String.join(" ", progressionQuest);
        return new String[]{question, correctAnswer};
    }

    private static String[] generateProgression(int firstNumber, int step) {
        int nextNumber;
        String[] progression = new String[LENGTH_PROGRESSION];
        progression[0] = String.valueOf(firstNumber);
        for (var i = 1; i < LENGTH_PROGRESSION; i++) {
            nextNumber = firstNumber + step;
            progression[i] = String.valueOf(nextNumber);
            firstNumber += step;
        }
        return progression;
    }
}
