package Lab_Chapter2;

import java.util.Scanner;

public class Twentyeight {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int radius;
        int diameter;
        double circumference;
        double area;

        System.out.print("Enter radius: ");
        radius = input.nextInt();

        diameter = 2 * radius;
        circumference = 2 * Math.PI * radius;
        area = Math.PI * (radius * radius);

        System.out.printf("Diameter is %d%n", diameter);
        System.out.printf("Circumference is %f%n", circumference);
        System.out.printf("Area is %f%n", area);
    }
}
