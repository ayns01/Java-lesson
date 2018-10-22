package Lab_Chapter2;

import java.util.Scanner;

public class Thirtytwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[5];

        for (int i=0; i<5; i++) {
            System.out.print("Enter five numbers: ");
            num[i] = input.nextInt();
        }

        for (int j=0; j<5; j++) {
            if (num[j] == 0) {
                System.out.printf("%d is zero", num[j]);
            } else if (num[j] > 0) {
                System.out.printf("%d is positive", num[j]);
            } else {
                System.out.printf("%d is negative", num[j]);
            }
            System.out.println();
        }
    }
}
