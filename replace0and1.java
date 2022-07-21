import java.util.Scanner;

public class replace0and1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string in digit form");
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++) {

            if (str.charAt(i) < '5') {

                str1+='0';
            }
            else{
                str1+='1';
            }
        }
        System.out.println(str1);
    }
}
