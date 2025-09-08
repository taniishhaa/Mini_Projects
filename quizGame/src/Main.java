import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //questions array
        String[] questions = {"Which of the following is not a feature of Java?",
                                "Which functional interface in Java does not return any value?",
                                "In Java, the final keyword can be applied to?"};

        //options array
        String[][] options = {{"1. Platform Independent", "2. Object-Oriented", "3. Supports Multiple Inheritance through Classes", "4. Automatic Garbage Collection"},
                        {"1. Supplier", "2. Consumer", "3. Function", "4. Predicate"},
                        {"1. Classes only", "2. Methods only", "3. Variables only", "4. Classes, Methods, and Variables"}};

        //answers
        int[] answers = {3, 2, 4};
        int score = 0;

        //welcome message
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");


        for(int i=0; i< questions.length; i++){
            //display questions
            System.out.println(questions[i]);
            //display options
            for(String option : options[i]){
                System.out.println(option);
            }

            //input guess
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            //check guess
            if(guess == answers[i]){
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            }else{
                System.out.println("********");
                System.out.println(" Wrong! ");
                System.out.println("********");
            }
        }

        //display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        sc.close();

    }
}
