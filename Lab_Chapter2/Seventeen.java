package Lab_Chapter2;

import java.util.Scanner;

public class Seventeen {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int sum;
        int average;
        int product;
        int max;
        int min;

        System.out.print("Enter your favorite number1: ");
        num1 = input.nextInt();

        System.out.print("Enter your favorite number2: ");
        num2 = input.nextInt();

        System.out.print("Enter your favorite number3: ");
        num3 = input.nextInt();

        max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;

        min = num1;
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;

        sum = num1 + num2 + num3;
        average = (num1 + num2 + num3) / 3;
        product = num1 * num2 * num3;

        System.out.printf("sum is %d%n", sum);
        System.out.printf("average is %d%n", average);
        System.out.printf("product is %d%n", product);
        System.out.printf("The largest number is %d%n", max);
        System.out.printf("The smallest number is %d%n", min);

    }
}
