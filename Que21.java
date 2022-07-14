import java.util.Scanner;

public class Que21 {
    public static void main(String[] args) {

        int a,b,c,d;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter fist number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        System.out.println("Enter third number");
        c=sc.nextInt();
        System.out.println("Enter fourth number");
        d=sc.nextInt();
        int res=(a>b && a>c && a>d?a:b>c && b>d?b:c>d?c:d);
        System.out.println("Greatest number among Given four number is...=");
      System.out.println(res);
    }
}
