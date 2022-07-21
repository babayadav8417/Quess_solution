import java.util.Scanner;

public class Ques32_Total_UniqueNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element");

        int i;
        for(i = 0; i < n; ++i) {
            arr[i] = input.nextInt();
        }

        System.out.println("Unique element in array is");
    int count=0;
        for(i = 0; i < n; ++i) {
            int j;
            for(j = 0; j < i && arr[i] != arr[j]; ++j) {
            }

            if (i == j) {
               count++;
            }
        }
        System.out.println(count);
    }
}
