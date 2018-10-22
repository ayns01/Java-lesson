package Lab_Chapter2;

import java.util.Scanner;

public class Fifteen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;
        int product;
        int diff;
        int quotient;

        System.out.print("Enter your favorite number1: ");
        num1 = input.nextInt();

        System.out.println("nter your favorite number2: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        diff = num1 - num2;
        quotient = num1 / num2;

        System.out.printf("sum is %d%n", sum);
        System.out.printf("product is %d%n", product);
        System.out.printf("diff is %d%n", diff);
        System.out.printf("quotient is %d%n", quotient);
    }
}
