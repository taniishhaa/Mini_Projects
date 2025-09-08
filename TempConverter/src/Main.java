import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        newTemp = unit.equals("C") ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("New temperature is: %.1f°%s", newTemp, unit);

        sc.close();
    }
}
