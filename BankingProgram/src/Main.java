import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning) {
            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }

        System.out.println("***************");
        System.out.println("Thank you! Have a nice day");

        sc.close();
    }

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        System.out.print("Enter the amount to be deposited: ");
        double amount = sc.nextDouble();

        if(amount < 0){
            System.out.print("Amount cant be negative.");
            return 0;
        }else{
            System.out.println("Amount has been deposited");
            return amount;
        }

    }
    static double withdraw(double balance){
        System.out.print("Enter amount to be withdrawn: ");
        double amount = sc.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount cant be negative");
            return 0;
        }else{
            System.out.println("Withdrawal successful");
            return amount;
        }
    }
}
