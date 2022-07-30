import java.util.Scanner;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to count all  factor");
        int num=sc.nextInt();
        System.out.println("Tatal number of factor of givan number....= "+AllFactor(num));
    }
    public static int AllFactor(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }
}
