package Lab_Chapter2;

import java.util.Scanner;

public class Thirty {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter your favorite digits: ");
        num = input.nextInt();

        String number = String.valueOf(num);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            System.out.printf("%d   ", j);
        }
    }
}
