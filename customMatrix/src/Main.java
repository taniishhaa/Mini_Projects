import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter the # of columns: ");
        cols = sc.nextInt();

        System.out.print("Enter the symbol: ");
        symbol = sc.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
