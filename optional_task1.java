import java.util.Scanner;

public class optional_task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check perfect number ");
        int n=sc.nextInt();
            int sum=0;
             for(int i=1;i<n;i++){
                if(n%i==0){
                   sum+=i;
                }
            }
             if(n==sum){
                 System.out.println("Given number is perfect number");
             }
             else System.out.println("Given number is not perfect number");
    }
}
