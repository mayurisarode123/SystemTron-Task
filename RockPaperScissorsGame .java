import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame { 

    public static void main(String args[] )
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock","Paper","Scissors"}; /*This is a string options */
        
        

        do {
            System.out.println("Enter your choice Rock or Paper or Scissors") ;
            System.out.println("If you want to quit the game please enter 'exit'");
            String userCh = sc.nextLine();

            if (userCh.equalsIgnoreCase("exit")) /*For ending the game */
            {
                System.out.println("Exit the game...");
                break;
            }

            if (!userCh.equalsIgnoreCase("Rock") && !userCh.equalsIgnoreCase("Paper") && !userCh.equalsIgnoreCase("Scissors")) /*If user enter invalid choice */
            {
                System.out.println("Invalid choice! Please enter valid choice...");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerCh = options[computerChoiceIndex];

            System.out.println("Computer chose: " + computerCh);

            if (userCh.equalsIgnoreCase(computerCh)) /*If it is a tie */
            {
                System.out.println("It is a tie!");
            } 
            else if (userCh.equalsIgnoreCase("Rock") && computerCh.equalsIgnoreCase("Scissors") ||
                    userCh.equalsIgnoreCase("Paper") && computerCh.equalsIgnoreCase("Rock") ||
                    userCh.equalsIgnoreCase("Scissors") && computerCh.equalsIgnoreCase("Paper")) {
                System.out.println("Yeah!! You win!...");
            } 
            else
            {
                System.out.println("Computer wins...!");
            }
        }while (true);

        sc.close();
    }
}
