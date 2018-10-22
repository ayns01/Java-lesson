package Lab_Chapter2;

import java.util.Scanner;

public class Twentyfour {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int max;
        int min;

        System.out.print("Enter your favorite number1: ");
        num1 = input.nextInt();

        System.out.print("Enter your favorite number2: ");
        num2 = input.nextInt();

        System.out.print("Enter your favorite number3: ");
        num3 = input.nextInt();

        System.out.print("Enter your favorite number4: ");
        num4 = input.nextInt();

        System.out.print("Enter your favorite number5: ");
        num5 = input.nextInt();

        max = num1;
        if(num2 > max) max = num2;
        if(num3 > max) max = num3;
        if(num4 > max) max = num4;
        if(num5 > max) max = num5;

        min = num1;
        if(num2 < min) min = num2;
        if(num3 < min) min = num3;
        if(num4 < min) min = num4;
        if(num5 < min) min = num5;

        System.out.printf("The largest number is %d%n", max);
        System.out.printf("The smallest number is %d%n", min);
    }
}
