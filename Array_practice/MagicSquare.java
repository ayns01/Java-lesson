package Array_practice;

import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args) {
//        Sample input 1
//        16 3 2 13
//        5 10 11 8
//        9 6 7 12
//        4 15 14 1
        Scanner in = new Scanner(System.in);

        // TODO: 1. input processing
        System.out.print("Input first row");
        String line1 = in.nextLine();
        String[] row1 = line1.split(" ");
        int[][] square = new int[4][4];
        for (int i=0; i<4; i++) {
            square[0][i] = Integer.parseInt(row1[i]);
        }
        System.out.print("Input second row");
        String line2 = in.nextLine();
        String[] row2 = line2.split(" ");
        for (int i=0; i<4; i++) {
            square[1][i] = Integer.parseInt(row2[i]);
        }

        System.out.print("Input third row");
        String line3 = in.nextLine();
        String[] row3 = line3.split(" ");
        for (int i=0; i<4; i++) {
            square[2][i] = Integer.parseInt(row3[i]);
        }

        System.out.print("Input fourth row");
        String line4 = in.nextLine();
        String[] row4 = line4.split(" ");
        for (int i=0; i<4; i++) {
            square[3][i] = Integer.parseInt(row4[i]);
        }

        magicSquare(square);


        // TODO: 3. pass the 2D array into the magicSquare function
        boolean magic = magicSquare(square);
        if (magic) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }
    }
    public static boolean magicSquare(int[][] square) {
        // TODO: 2. check if input square is a magic square
        int tmp = 0;
        // Check each row
        for (int i=0; i<4; i++) {
            int sum = 0;
            for (int j=0; j<4; j++) {
                sum = sum + square[i][j];
            }
            if (i != 0) {
                if (tmp != sum) {
                    return false;
                }else {
                    continue;
                }
            }
            tmp = sum;
        }

        // Check each column
        for (int i=0; i<4; i++) {
            int sum = 0;
            for (int j=0; j<4; j++) {
                sum = sum + square[j][i];
            }
                if (tmp != sum) {
                    return false;
                }else {
                    tmp = sum;
                    continue;
                }
        }

        // Check incline from lefttop to rightbottom
        int sum = 0;
        for (int i=0; i<4; i++) {
            sum = sum + square[i][i];
        }
        if (tmp != sum) {
            return false;
        }else {
            tmp = sum;
        }

        // Check incline from righttop to leftbottom
        sum = 0;
        int j = 3;
        for (int i=0; i<4; i++) {
            sum = sum + square[i][j];
            j--;
        }
        if (tmp != sum) {
            return false;
        }else {
            tmp = sum;
        }

        return true;
    }
}
