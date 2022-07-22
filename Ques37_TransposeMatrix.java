import java.util.*;

public class Ques37_TransposeMatrix {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the row and column respectively");
                int row = sc.nextInt();
                int col = sc.nextInt();
                System.out.println("Enter Total " + row * col + " element in matrix");
                int[][] arr = new int[row][col];

                int i;
                int j;
                for(i = 0; i < row; ++i) {
                    for(j = 0; j < col; ++j) {
                        arr[i][j] = sc.nextInt();
                    }
                }
        System.out.println("Your given matrix");
                for(i = 0; i < row; i++) {
                    for(j = 0; j < col; j++) {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }

                System.out.println("\nTranspose Matrix ");
                int [][]res=new int[col][row];
                for(i = 0; i < row; ++i) {
                    for(j = 0; j < col; ++j) {
                        res[j][i]=arr[i][j];
                    }
                }

        for(i = 0; i < col; i++) {
            for(j = 0; j < row; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
