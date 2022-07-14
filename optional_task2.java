import java.util.Scanner;

public class optional_task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range to find perfect number in this range ");
        System.out.println("Enter lower number");
        int n1=sc.nextInt();
        System.out.println("Enter Upper number");
        int n2=sc.nextInt();
        int j;
        for( j=n1;j<=n2;j++) {
            int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (j == sum) {
                System.out.print(j+" ");
            }
        }
    }
}
