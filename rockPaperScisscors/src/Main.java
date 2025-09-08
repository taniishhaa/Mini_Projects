import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playAgain = "yes";

        do{
            System.out.print("Enter your move: ");
            String playerChoice = sc.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice!");
                continue;
            }

            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("Its a tie!");
            }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("You win!");
            }else{
                System.out.println("You lose!");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.nextLine();
        }while(playAgain.equals("yes"));

        System.out.println("Thank you for playing!");

        sc.close();
    }
}
