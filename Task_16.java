import java.util.Scanner;

public class Task_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upper number to find all prime factor below it");
        int num=sc.nextInt();
        int i,j;
        for( i=2;i<=num;i++){
            for( j=2;j<i;j++) {
                if (i % j == 0) {
                    break;
                }
            }
                if(i==j) {
                    System.out.print(j + " ");
                }
        }
    }
}
