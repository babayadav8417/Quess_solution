import java.util.Arrays;
import java.util.Scanner;

public class Ques33_Scond_Laregest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Integral value in array ");

        int n1;
        for(n1 = 0; n1 < n; ++n1) {
            arr[n1] = input.nextInt();
        }

        Arrays.sort(arr);
        n1 = arr.length - 1;
        int a = arr[n1];
        int b = 0;

        for(int i = 0; i < n; ++i) {
            if (arr[i] < a) {
                b = arr[i];
            }
        }

        System.out.println("Second largest number in given array is.... = " + b);

    }
}
