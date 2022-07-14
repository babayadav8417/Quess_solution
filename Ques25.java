import java.util.Scanner;

public class Ques25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic salary of this employee ");
        double basicSalary=sc.nextDouble();
        double TA=basicSalary*0.10;
        double DA=basicSalary*0.15;
        double HRA=basicSalary*0.20;
        double PF=basicSalary*0.12;
        if(basicSalary>=20000){
            double bonus=basicSalary*0.10;
            basicSalary+=TA+DA+HRA+bonus-PF;
        }
        else {
            double bonus=basicSalary*0.20;
            basicSalary+=TA+DA+HRA+bonus-PF;
        }
        System.out.println("Your gross salary is...... = "+basicSalary+"\n .....THANK YOU FOR YOUR HELP.......");
    }
}
