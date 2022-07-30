import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.println("Enter number");
        long n= sc.nextInt();
        long sum=0;
        for(long i=1;i<=n;i++){
            sum+=(long)Math.pow(i,3);
        }
        System.out.println("Sum of cube of all number up to n ..="+sum);
    }
}
