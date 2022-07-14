import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        System.out.println("Enter your number to get that number's sum...\n");
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("sum of given digit is..=\n"+sum);
    }
}
