import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        System.out.println("Enter number to check , is it armstrong or not\n");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int orgn1=num;
        int orgn2=num;
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        int sum=0;
        while(orgn1!=0){
            int rem=orgn1%10;
            sum+=Math.pow(rem,count);
            orgn1/=10;
        }
        if(orgn2==sum){
            System.out.println("given number is armstrong\n");
        }
        else System.out.println("Given number is not armstrong\n");
    }
}
