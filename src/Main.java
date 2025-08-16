import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1); // range is 1 - 100

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! try again");
            }
            else if (guess > randomNumber){
                System.out.println("TOO HIGH!Try again");
            }
            else {
                System.out.println("CORRECT! The Number was " + randomNumber);
                System.out.println("Number of attempts: " + attempts );
            }

        }while(guess != randomNumber);

        System.out.println("you have won");

        scanner.close();
    }
}