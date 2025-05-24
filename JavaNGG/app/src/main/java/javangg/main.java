

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void runPlayer(Scanner scanner) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int maxGuesses = 5;
        int i = maxGuesses;

        while (i > 0) {
            System.out.print("You have " + i + " guesses left. Pick a number, 1-100: ");
            int pInput = scanner.nextInt();
            if (pInput == randomNumber) {
                System.out.println("You have picked the correct number! You've won! It took you " + ((maxGuesses + 1) - i) + " guesses");
                break;
            } else if (pInput > randomNumber) {
                System.out.println("lower");
            } else if (pInput < randomNumber) {
                System.out.println("higher");
            }
            i--;
        }

        if (i == 0) {
            System.out.println("You lost. The number was " + randomNumber);
        }
    }

    public static void runComputer(Scanner scanner) {
        int guessNumber = 50;
        int guesses = 5;
        Object[] numbers = {25, new int[]{12, 13}, new int[]{6, 7}, new int[]{3, 4}};
        boolean gameWon = false;
        Random rand = new Random();

        System.out.println("ok pick a number! \nI have " + guesses + " guesses. After each guess, tell me higher, lower, or correct");
        for (int i = 0; i < guesses; i++) {
            System.out.print("Guess " + (i + 1) + ": " + guessNumber + ". (h/l/c): ");
            String answer = scanner.next().toLowerCase();
            if (answer.equals("c")) {
                System.out.println("Yay, I won! it took me " + (i + 1) + " guesses!");
                gameWon = true;
                break;
            } else if ((answer.equals("h") || answer.equals("l")) && i < 4) {
                int sign = answer.equals("h") ? 1 : -1;
                int num;
                if (numbers[i] instanceof int[] range) {
                    num = rand.nextInt(range[1] - range[0] + 1) + range[0];
                } else {
                    num = (int) numbers[i];
                }
                guessNumber += num * sign;
            }
        }
        if (!gameWon) {
            System.out.println("Oh no! I lost!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain = "y";
        while (playAgain.equalsIgnoreCase("y")) {
            System.out.print("Who will guess the number? (Computer/Player): ");
            String pInput = scanner.next();
            if (pInput.equalsIgnoreCase("player")) {
                runPlayer(scanner);
            } else if (pInput.equalsIgnoreCase("computer")) {
                runComputer(scanner);
            }
            System.out.print("Would you like to play again? y/n ");
            playAgain = scanner.next();
        }
        scanner.close();
    }
}
