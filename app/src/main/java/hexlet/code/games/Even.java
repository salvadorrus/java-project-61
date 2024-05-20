package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void runGame() {
        var questions = new String[3][];
        for (var i = 0; i < 3; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static String[] generateGame() {
        var randomNumber = Utils.getRandomInt(1, 100);
        var correctAnswer = isEven(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}

