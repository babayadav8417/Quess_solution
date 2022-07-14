import java.util.Scanner;

public class optional_Ques {
    public int pow(int n1,int n2){
        if(n2==0){
            return 1;
        }
        return n1*pow(n1,n2-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base namber");
        int b=sc.nextInt();
        System.out.println("Enter power of base number");
        int pn=sc.nextInt();
        optional_Ques obj=new optional_Ques();
        int res=obj.pow(b,pn);
        System.out.println("Power of given base and power number = "+res);
    }
}
