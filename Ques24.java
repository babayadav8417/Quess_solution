import java.util.*;

public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter if married then Y or if unmarried then N");
        String status = sc.next();
        if (status.equals("Y")) {
            System.out.println("you are allow for company insurance");
        }
        else if(status.equals("N")) {
            System.out.println("Enter gender F for female and M for male");
            String gender = sc.next();
            if (gender.equals("M")) {
                System.out.println("Enter age of this man b/c it is unmarried");
                int age = sc.nextInt();
                if (age > 30) {
                    System.out.println("......CONGRATULATION......\n Company will allow you for insurance");
                } else
                    System.out.println(".....SORRY......\nyou are not allow for this company's insurance policy");
            }
            else if (gender.equals("F")) {
                System.out.println("Enter age of this man b/c it is unmarried");
                int age = sc.nextInt();
                if (age > 25) {
                    System.out.println("......CONGRATULATION......\n Company will allow you for insurance");
                }
                else
                    System.out.println(".....SORRY......\n you are not allow for this company's insurance policy");
            }
        }
        else System.out.println("PLZ choose correct option");
    }
}

