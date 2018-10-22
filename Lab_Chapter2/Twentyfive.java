package Lab_Chapter2;

import java.util.Scanner;

public class Twentyfive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter your favorite number1: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d is even number.", num);
        }else {
            System.out.printf("%d is odd number.", num);
        }
    }
}
