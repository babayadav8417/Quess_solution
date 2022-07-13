import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower number");
        int num1=sc.nextInt();
        System.out.println("Enter upper number");
        int num2=sc.nextInt();
        int i,j;
        for( i=num1;i<num2;i++){
            for( j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.println(i);
            }
        }
    }
}
