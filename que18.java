import java.util.Scanner;

public class que18 {
    public static void main(String[] args) {
        System.out.println("enter number of any digit\n");
        int num;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println(rev);
    }
}
