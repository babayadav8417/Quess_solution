import java.util.Scanner;

public class Optional_task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Row of your pattern");
        int n=sc.nextInt();
        System.out.println("All even number from 2 to given number by skipping  last digit 0 ");
        for(int i=2;i<=n;i++){
            if(i%2==0){
               int last_digit=i%10;
               if(last_digit==0)
               continue;
                System.out.println(i);
            }
        }
    }
}
