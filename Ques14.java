import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to which you want to find prime  factor");
        int num=sc.nextInt();
        while(num>0){
            for(int i=2;i<=num;i++){
                if(num%i==0){
                    System.out.println(i);
                    num/=i;
                    break;
                }
            }
        }
    }
}
