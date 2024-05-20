package hexlet.code;

import java.util.Scanner;

public class Cli {
    static void greeting() {

        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inputName = new Scanner(System.in);
        var scannName = inputName.nextLine();
        System.out.println("Hello, " + scannName + "!");
    }
}
