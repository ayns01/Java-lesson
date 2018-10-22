package Lab_Chapter2;

import java.util.Scanner;

public class Thirtythree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms");
        float kg = input.nextFloat();

        System.out.println("Enter your height in meters");
        float meter = input.nextFloat();

        float bmi = kg / (meter * meter);

        System.out.println("BMI VALUES");
        if ( bmi < 18.5 ) {
            System.out.print("Under weight: less than 18.5");
        }else if ( 18.5 < bmi && bmi < 24.9 ) {
            System.out.print("Normal: between 18.5 and 24.9");
        }else if ( 25 < bmi && bmi < 29.9 ) {
            System.out.print("Overweight: between 25 and 29.9");
        }else {
            System.out.print("Obese: 30 or greater");
        }
    }
}
