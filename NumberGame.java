import java.util.Scanner;

public class NumberGame {

    public static void Game(Scanner sc, int min, int max) {
        int number = min + (int) (Math.random() * ((max - min) + 1));
        int Attempt = 5;
        int score = 0;

        System.out.println("Welcome in number game");
        System.out.println("The number is choosen between 0 to 100");
        for (int i = 1; i <= Attempt; i++) {
            System.out.println("Attempt " + i + " Enter your guess :");
            int guess = sc.nextInt();
            if (guess == number) {
                score = i;
                System.out.println("Congratulations you guess the correct number in " + score + " trials");
                System.out.println("Your Score is " + score);
                return;
            } else if (guess < number) {
                System.out.println("Number is too low, try higher number");
            } else {
                System.out.println("Number is too high, try lower number");
            }
        }
        System.out.println("you lose the game, the correct number was " + number);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // range of random number
        int min = 1;
        int max = 100;
        do {
            Game(sc, min, max);
            System.out.println("Do you want to play again: ");
            String playagain = sc.next();
            if (!playagain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing.");
                break;
            }
        } while (true);
        sc.close();
    }

}