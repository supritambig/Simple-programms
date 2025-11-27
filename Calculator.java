
import java.util.Scanner;

class Calculator {
    
    double calculate(double a, double b, String op) {

        switch (op) {

            case "+":
                return a + b;

            case "-":
                return a - b;

            case "*":
                return a * b;

            case "/":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Cannot divide by zero");
                    return 0;
                }

            default:
                System.out.println("Invalid operator");
                return 0;
        }
    }
}

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);

        System.out.println("Result: " + result);
    }
}

