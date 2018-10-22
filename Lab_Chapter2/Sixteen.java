package Lab_Chapter2;

import java.util.Scanner;

public class Sixteen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter your favorite number1: ");
        num1 = input.nextInt();

        System.out.print("Enter your favorite number2: ");
        num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println("These numbers are equal.");
        }else if (num1 > num2) {
            System.out.printf("%d is larger.", num1);
        }else {
            System.out.printf("%d is larger.", num2);
        }
    }
}
