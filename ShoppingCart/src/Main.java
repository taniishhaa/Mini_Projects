import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency ='$';
        double total;

        System.out.print("What item would you like to buy? ");
        item = sc.nextLine();
        System.out.print("What is the price of your item? ");
        price = sc.nextDouble();
        System.out.print("How many " + item + " would you like? ");
        quantity = sc.nextInt();

        total = price * quantity;
        System.out.println();

        System.out.print("You have bought " + quantity + " " + item + "/s for $" + price );
        System.out.println();
        System.out.println("Your total is " + currency + total);

        sc.close();
    }
}
