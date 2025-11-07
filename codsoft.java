import java.util.*;

public class codsoft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0, playAgain;

        do {
            int number = rand.nextInt(100) + 1;
            int attempts = 7, guess = 0;

            System.out.println("\nGuess the number (1–100)! You have " + attempts + " attempts.");

            while (attempts-- > 0) {
                System.out.print("Enter guess: ");
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("🎉 Correct! You guessed it!");
                    score += attempts + 1; // bonus for fewer attempts used
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
                System.out.println("Attempts left: " + attempts);
            }

            if (guess != number)
                System.out.println("❌ Out of attempts! The number was " + number);

            System.out.println("Current score: " + score);
            System.out.print("Play again? (1 = Yes, 0 = No): ");
            playAgain = sc.nextInt();

        } while (playAgain == 1);

        System.out.println("Final Score: " + score + "\nThanks for playing!");
        sc.close();
    }
}
