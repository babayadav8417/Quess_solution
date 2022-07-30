import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter lower number");
        int a= sc.nextInt();
        System.out.println("Enter upper number");
        int b= sc.nextInt();
        int min= Math.min(a, b);
        int max=Math.max(a,b);
        int sum=0;
        for(int i=min;i<=max;i++){
            sum+=i;
        }
        System.out.println("Sum b/w given two number is.. = "+sum);
    }
}
