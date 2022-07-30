import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime");
        int num=sc.nextInt();
        Task_11 obj=new Task_11();
        if(obj.Isprime(num))
            System.out.println("The given number is prime");
        else
            System.out.println("The given number is not prime");
    }
    public boolean Isprime(int n){
        int i;
        for( i=2;i<n;i++){
            if(n%i==0){
                break;
            }
        }
        return i == n;
    }
}
