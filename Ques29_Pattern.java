import java.util.Scanner;

public class Ques29_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Row of your pattern");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = i; j <= n; ++j) {
                System.out.print((char)(j + 64) + " ");
            }

            System.out.println();
        }
    }
}
