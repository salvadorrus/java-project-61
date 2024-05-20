package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void runGame() {
        var questions = new String[3][];
        for (var i = 0; i < 3; i++) {
            questions[i] = generateGame();
        }
        Engine.run(questions,
                "\nAnswer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    private static String[] generateGame() {
        var randomNumber = Utils.getRandomInt(1, 100);
        var correctAnswer = isPrime(randomNumber) ? "yes" : "no";
        return new String[]{String.valueOf(randomNumber), correctAnswer};
    }

    private static boolean isPrime(int randomNumber) {
        for (var i = 2; i < randomNumber / 2; i++) {
            var result = randomNumber % i;
            if (result == 0) {
                return false;
            }
        }
        return true;
    }
}
