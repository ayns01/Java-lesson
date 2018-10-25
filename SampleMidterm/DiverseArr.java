package SampleMidterm;

public class DiverseArr {

    public static void main(String[] args) {

        int[][] mat1;
        mat1 = new int[4][5];
        mat1[0][0] = 1;
        mat1[0][1] = 3;
        mat1[0][2] = 2;
        mat1[0][3] = 7;
        mat1[0][4] = 3;
        mat1[1][0] = 10;
        mat1[1][1] = 10;
        mat1[1][2] = 4;
        mat1[1][3] = 6;
        mat1[1][4] = 2;
        mat1[2][0] = 5;
        mat1[2][1] = 3;
        mat1[2][2] = 5;
        mat1[2][3] = 9;
        mat1[2][4] = 6;
        mat1[3][0] = 7;
        mat1[3][1] = 6;
        mat1[3][2] = 4;
        mat1[3][3] = 2;
        mat1[3][4] = 1;

        int[] rowSum = rowSums(mat1);
        System.out.print("rowSum is: ");
        for (int i = 0; i < rowSum.length; i++) {
            System.out.print(rowSum[i] + " ");
        }

        System.out.println();
        System.out.println("isDiverse: " + isDiverse(mat1));

    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int elem: arr) {
            sum += elem;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sums = new int[arr2D.length];
        int currentRow = 0;
        for(int[] row: arr2D) {
            sums[currentRow] = arraySum(row);
            currentRow++;
        }
        return sums;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] sumsOfRows = rowSums(arr2D);
        for(int i = 0; i < sumsOfRows.length - 1; i++) {
            for(int j = i + 1; j < sumsOfRows.length; j++) {
                if (sumsOfRows[i] == sumsOfRows[j]) {
                    // not diverse
                    return false;
                }
            }
        }
        return true;
    }

}
