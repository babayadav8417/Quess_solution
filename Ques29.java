import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Row of your pattern");
        int n=sc.nextInt();
        char ch=sc.next().charAt(0);
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
