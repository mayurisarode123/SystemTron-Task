import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int s = random.nextInt(100) + 1;
        int a= 0;
        System.out.println("\n Welcome to the Number Guessing Game using java!");
        System.out.println("\n I have selected a number between 1 and 100."); 
        System.out.println("\n See if you can guess it in 10 turns or fewer. Good luck!");  
 
        while (a< 5) {
            System.out.println("\n Enter your guess:");
            int u = scanner.nextInt();   
            if (u < 1 || u> 100) {
                System.out.println("\n Please enter a number between 1 and 100.");
                continue;
            }   
            a++;   
            if (u < s) {
                System.out.println("\n Too low! Please Try again.");
            } else if (u > s) {
                System.out.println("\n Too high! Please Try again.");
            } else {
                 System.out.println("\n Congratulations! You've guessed the number in " + a + " attempts.");
                break;

            }
        }
        if (a == 5) {
            System.out.println("\n Sorry, you've run out of attempts. The number was " + s + ".");
        }
        scanner.close();
    }
}
