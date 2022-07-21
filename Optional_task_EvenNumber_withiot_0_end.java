import java.util.Scanner;

public class Optional_task_EvenNumber_withiot_0_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper limit");
        int n = sc.nextInt();
        System.out.println("All even number from 2 to given number by skipping  last digit 0 ");

        for(int i = 2; i <= n; ++i) {
            if (i % 2 == 0) {
                int last_digit = i % 10;
                if (last_digit != 0) {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
