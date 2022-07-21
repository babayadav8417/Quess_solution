import java.util.Scanner;

public class Optional_task_AdditionMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of First matrix");
        int row1 = sc.nextInt();
        System.out.println("Enter the column of First matrix");
        int col1 = sc.nextInt();
        System.out.println("Enter the row of Second matrix");
        int row2 = sc.nextInt();
        System.out.println("Enter the column of Second matrix");
        int col2 = sc.nextInt();
        if (row1 == row2 && col1 == col2) {
            int[][] arr1 = new int[row1][col1];
            System.out.println("Enter in first matrix " + row1 * col1 + " element");

            int i,j;
            for( i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    arr1[i][j] = sc.nextInt();
                }
            }

            int[][] arr2 = new int[row2][col2];
            System.out.println("Enter in Second matrix " + row2 * col2 + " element");


            for(i = 0; i < row2; ++i) {
                for(j = 0; j < col2; ++j) {
                    arr2[i][j] = sc.nextInt();
                }
            }

            int[][] res = new int[row1][col2];


            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    res[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            System.out.println("Your first matrix is this");

            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    System.out.print(arr1[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println("Your Second matrix is this");

            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    System.out.print(arr2[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println("sum of element of your both matrix is...>>>");

            for(i = 0; i < row1; ++i) {
                for(j = 0; j < col1; ++j) {
                    System.out.print(res[i][j] + " ");
                }

                System.out.println();
            }
        } else {
            System.out.println("Error:  sorry your both matrix having different row and column it should be");
        }

    }
}

