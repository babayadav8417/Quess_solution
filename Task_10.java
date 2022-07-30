import java.util.Scanner;

public class Task_10 {
    public static final String ANSI_RESET ="\u001B[0m";
    public static final String ANSI_GREEN ="\u001B[32m";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");

        String str=sc.nextLine();
        System.out.println("Your string after removing vowel ");
        System.out.println(ANSI_GREEN+removevowel(str)+ANSI_RESET);
    }
    public static String removevowel(String str){
        String str1=str.replaceAll("[AEIOU]","");
        return str1.replaceAll("[aeiou]","");
    }
}
