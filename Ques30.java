import java.util.Scanner;

public class Ques30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of array element = "+sum);
    }
}
