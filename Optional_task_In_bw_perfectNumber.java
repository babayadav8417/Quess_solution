import java.util.Scanner;

public class Optional_task_In_bw_perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range to find perfect number in this range ");
        System.out.println("Enter lower number");
        int n1 = sc.nextInt();
        System.out.println("Enter Upper number");
        int n2 = sc.nextInt();
        System.out.println("Perfect number b/w given range is.....= ");
        for(int j = n1; j <= n2; ++j) {
            int sum = 0;

            for(int i = 1; i < j; ++i) {
                if (j % i == 0) {
                    sum += i;
                }
            }

            if (j == sum) {
                System.out.print("" + j + " ");
            }
        }
    }
}
