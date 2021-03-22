import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1 = 3.34d;
        double num2 = 5.76d;

        Calculator calculator = new Calculator();

        double resultAdd = calculator.add(num1, num2);
        double resultSubtract = calculator.subtract(num1, num2);
        double resultDivide = calculator.divide(num1, num2);
        double resultMultiply = calculator.multiply(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + resultDivide);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + x*y);
        System.out.println("x / y = " + x/y);

        System.out.println("√x = " + Math.sqrt(x));
        }

    }

