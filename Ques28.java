import java.util.Scanner;

public class Ques28 {
    public int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int n=sc.nextInt();
        Ques28 obj=new Ques28();
        int res=obj.sum(n);
        System.out.println("the sum of all number in range from 1 to given number");
        System.out.println(res);
    }
}
