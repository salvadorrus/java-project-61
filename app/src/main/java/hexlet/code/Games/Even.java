package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    public static void runGame() {
        Engine.run(Engine.roundCounter(generateGame()),
                "\nAnswer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static String[] generateGame() {
        var randomNumber = new Random().nextInt(100);
        var correctAnswer = isEven(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isEven(int randomNumber) {
        return randomNumber % 2 == 0;
    }
}

