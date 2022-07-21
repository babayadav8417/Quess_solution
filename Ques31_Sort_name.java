import java.util.Arrays;
import java.util.Scanner;

public class Ques31_Sort_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the array element by providing name");
        String[] arr = new String[n];

        int i;
        for(i = 0; i < n; ++i) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);
        System.out.println("All name in array are in increasing order");

        for(i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
