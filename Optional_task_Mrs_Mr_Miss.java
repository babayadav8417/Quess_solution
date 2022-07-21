import java.util.Scanner;

public class Optional_task_Mrs_Mr_Miss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m for male or f for female ");
        char ch = sc.next().charAt(0);
        if (ch == 'm' || ch == 'M') {
            System.out.println(" You should choose like  \n Mr.");
        }

        if (ch == 'f' || ch == 'F') {
            System.out.println("Enter married status Y for married | N for unmarried");
            char ch1 = sc.next().charAt(0);
            if (ch1 != 'Y' && ch1 != 'y') {
                System.out.println("You should choose like  \n Miss.");
            } else {
                System.out.println("You should choose like  \n Mrs.");
            }
        }
    }
}