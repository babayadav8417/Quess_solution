import java.util.Scanner;

public class Que20 {
    public static void main(String[] args) {
        System.out.print("Enter Number one by one to find Armstrong between them\n");
        int num1,num2;
        System.out.print("Enter lower limit\n");
        Scanner s=new Scanner(System.in);
        num1=s.nextInt();
        System.out.print("Enter higher limit\n");
        num2=s.nextInt();
        System.out.print("The armstrong number are....=\n");
        for(int i=num1;i<num2;i++){
            int orgn1=i;
            int orgn2=i;
            int orgn3=i;
            int count=0;
            while(orgn1!=0){
                orgn1/=10;
                count++;
            }
            int sum=0;
            while(orgn2!=0){
                int rem=orgn2%10;
                sum+=Math.pow(rem,count);
                orgn2/=10;
            }
            if(orgn3==sum)
                System.out.println(orgn3);
        }
    }
}
