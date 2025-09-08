import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter weight in lbs: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }else if(choice == 2){
            System.out.print("Enter weight in kgs: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f" , newWeight);
        }else{
            System.out.print("invalid choice");
        }

         sc.close();
    }
}
