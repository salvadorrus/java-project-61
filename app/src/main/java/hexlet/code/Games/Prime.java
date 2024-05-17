package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    public static void runGame() {
        Engine.run(Engine.roundCounter(generateGame()),
                "\nAnswer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[] generateGame() {
        Random random = new Random();
        boolean isPrimeNumber = true;
        var randomNumber = random.nextInt(100);
        for (var i = 2; i < randomNumber / 2; i++) {
            var result = randomNumber % i;
            if (result == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        var correctAnswer = isPrimeNumber ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

}
