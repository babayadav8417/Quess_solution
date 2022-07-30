import java.util.Collections;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter currency number");
        String str= sc.next();
        System.out.println("Enter currency");
        int x= sc.nextInt();
        StringBuilder sb=new StringBuilder(str);
        String str1= String.valueOf(sb.reverse());
        if(str.equals(str1)){
            System.out.println("Congratulation Mr. Lalwani you have got 3 times of your currency..="+(3*x));
        }
        else System.out.println("Sorry your currency can't be thrice....");
    }
}
