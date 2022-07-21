import java.util.Scanner;

public class Ques30_Sum_Avarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element");

        int sum;
        for(sum = 0; sum < n; ++sum) {
            arr[sum] = sc.nextInt();
        }

        sum = 0;

        for(int i = 0; i < n; ++i) {
            sum += arr[i];
        }

        float sum1 = (float)sum;
        float avrg = sum1 / (float)arr.length;
        System.out.println("The sum of array element = " + sum + "\n The average of given array element ..= " + avrg);
    }
}
