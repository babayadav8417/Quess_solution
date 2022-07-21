import java.util.Arrays;
import java.util.Scanner;

public class Ques35_Maximum_Minimum {
    public static void  sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element");

        for(int i = 0; i < n; ++i) {
            arr[i] = input.nextInt();
        }

        sort(arr,n);
        System.out.println("Your array after sorting ");
        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Minimum number in array is..= " + arr[0]);
        System.out.println("Maximum number in array is..= " + arr[n - 1]);

    }
}
