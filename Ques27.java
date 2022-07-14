import java.util.Scanner;

public class Ques27 {
    public void table(int n,int i){


      if(i>10){
          return ;
      }
      else {
          System.out.println(n + "*" + i + "= " + n * i);
          table(n,i+1);

      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. to find the table of this");
        int n= sc.nextInt();
        Ques27 obj=new Ques27();
        System.out.println("table of given number is... ");
       obj.table(n,1);
    }
}
