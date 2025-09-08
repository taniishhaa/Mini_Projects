import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Interest rate: ");
        double rate = sc.nextDouble() / 100;

        System.out.print("# of compounds per year: ");
        int timesCompounded = sc.nextInt();

        System.out.print("# of years: ");
        int years = sc.nextInt();

        double amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);
        System.out.print("Final amount after " + years + " year/s is: " + amount);

        sc.close();
    }
}
