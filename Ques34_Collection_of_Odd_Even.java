import java.util.Arrays;
import java.util.Scanner;

public class Ques34_Collection_of_Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element");

        int count1;
        for(count1 = 0; count1 < n; ++count1) {
            arr[count1] = input.nextInt();
        }

        count1 = 0;
        int count2 = 0;

        for(int i = 0; i < n; ++i) {
            if(arr[i]==0){
                continue;
            }
            else if(arr[i] % 2 == 0) {
                ++count1;
            } else {
                ++count2;
            }
        }

        int[] arr1 = new int[count1];
        int[] arr2 = new int[count2];
        int j = 0;
        int k = 0;

        int i;
        for(i = 0; i < n; ++i) {
            if(arr[i]==0){
                continue;
            }
            else if (arr[i] % 2 == 0) {
                arr1[j] = arr[i];
                ++j;
            }
            else {
                arr2[k] = arr[i];
                ++k;
            }
        }

        Arrays.sort(arr1);
        System.out.print("Even number in Given array is...= ");

        for(i = 0; i < arr1.length; ++i) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        Arrays.sort(arr2);
        System.out.print("Odd number in Given array is...= ");

        for(i = 0; i < arr2.length; ++i) {
            System.out.print(arr2[i] + " ");
        }

    }
}

