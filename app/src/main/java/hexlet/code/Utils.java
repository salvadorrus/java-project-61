package hexlet.code;

import java.util.Random;

public class Utils {

    public static final int RANDOM_NUMBER = 100;
    public static final int MAX_RANDOM_NUMBER = 20;
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int LENGTH_PROGRESSION = 10;

    public static int getRandomInt(int minNumber, int maxNumber) {
        Random random = new Random();
        return random.nextInt((maxNumber - minNumber) + 1) + minNumber;
    }
}
