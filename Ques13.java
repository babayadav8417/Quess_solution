import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter upper number");
        int num2=sc.nextInt();
        int i,j,count=0;
        for( i=2;i<num2;i++){
            for( j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(i==j){
                count++;
            }
        }
        System.out.println("Total number of prime number is= .. "+count);
    }
}
