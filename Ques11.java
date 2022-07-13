import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check it is prime or not");
        int num=sc.nextInt();
        int i;
        for( i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Given number is not prime");
                break;
            }
        }
        if(num==i){
            System.out.println("given number is prime");
        }
    }
}
