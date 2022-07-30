import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string in digit form");
        String str=sc.nextLine();
        StringBuilder str1= new StringBuilder();
        for(int i=0;i<str.length();i++) {

            if (str.charAt(i) < '5') {

                str1.append('0');
            }
            else{
                str1.append('1');
            }
        }
        System.out.println(str1);
    }
}
