import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;
        boolean validOperator = true;

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, /, %, *, ^: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' ->{
                if(num2 == 0){
                    System.out.print("Can not divide by 0");
                    validOperator = false;
                }else{
                    result = num1 / num2;
                }
            }
            case '%' -> result = num1 % num2;
            case '^' -> result = Math.pow(num1, num2);
            default ->{
                System.out.print("Invalid operator");
                validOperator = false;
            }
        }

        if(validOperator){
            System.out.println("The answer is " + result);
        }

    }
}
