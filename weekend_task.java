

import java.util.*;

import static java.lang.System.exit;

public class weekend_task {
    public static final String ANSI_RESET ="\u001B[0m";
    public static final String ANSI_YELLOW ="\u001B[33m";
    public static final String ANSI_WHITE_BACKGROUND ="\u001B[47m";
    public  static final String ANSI_BLACK="\u001B[31m";
    // to check octal number
    public static int ToCheckOctal(String str){
        Scanner sc=new Scanner(System.in);
        boolean check=true;
        while (check) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '7') {

                }
                else {
                    System.out.println(ANSI_BLACK+"Enter correct Octal number in form of 0 and 1"+ANSI_RESET);
                    str = sc.next();
                    check=true;
                    break;
                }
                check=false;
            }
        }
        int x=Integer.parseInt(str);
        return x;
    }
    // To check binary number
    public static int ToCheckBinery(String str){
        Scanner sc=new Scanner(System.in);
        boolean check=true;
        while (check) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0' || str.charAt(i) == '1') {

                }
                else {
                    System.out.println(ANSI_BLACK+"Enter correct binary number in form of 0 and 1"+ANSI_RESET);
                    str = sc.next();
                    check=true;
                    break;
                }
                check=false;
            }
        }
        int x=Integer.parseInt(str);
        return x;
    }
    public static int setbits0(int n){
        int count=0,orgn=decimalTobinary(n);
        while (orgn>0){
            orgn/=10;
            count++;
        }
        return count-setbits1(n);
    }
    public static int setbits1(int n){
        int count =0;
        while(n>0){
            n=n&(n-1);// checking for 1
            count++;
        }
        return count;
    }
    // HEXA TO BINARY NUMBER CONVERSION SYSTEM
    public static int HexaToOcta(String str){
        int x=HexaToDecimal(str);
        return decimalToocta(x);
    }
    // HEXA TO BINARY NUMBER CONVERSION SYSTEM
    public static int HexaToBinary(String str){
        int x=HexaToDecimal(str);
        return decimalTobinary(x);
    }
    // HEXA TO DECIMAL NUMBER CONVERSION SYSTEM
    public static int HexaToDecimal(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String str1= sb.toString();
        int ans=0;
        for(int i=0;i<str1.length();i++){
            if((str1.charAt(i)-55)>=10){
                int x=(str1.charAt(i))-55;
                ans+=x*(int)Math.pow(16,i);
            }
            else{
                int x=str1.charAt(i)-'0';
                ans+=(int) Math.pow(16,i)*x;
            }
        }
        return ans;
    }
    // OCTA TO HEXA NUMBER CONVERSION SYSTEM
    public static String OctaToHexa(int n){
        int x=OctaTodecimal(n);
        return decimalTohexa(x);
    }
    // OCTA TO BINARY NUMBER CONVERSION SYSTEM
    public static int OctaTobinary(int n){
        int x=OctaTodecimal(n);
        return decimalTobinary(x);
    }
    // OCTA TO DECIMAL NUMBER CONVERSION SYSTEM
    public static int OctaTodecimal(int n){
        int ans=0;
        int i=0;
        while(n>0){
            int rem=n%10;
            ans+=(int)Math.pow(8,i)*rem;
            n/=10;
            i++;
        }
        return ans;
    }
    // BINARY TO HEXA NUMBER CONVERSION SYSTEM
    public static String binaryTohexa(int n){
        int x=binaryTodecimal(n);
        return decimalTohexa(x);
    }
    // binary to octa
    public static int binaryToocta(int n){
        int x=binaryTodecimal(n);
        int ans =decimalToocta(x);
        return ans;
    }
    // binary to decimal
    public static int binaryTodecimal(int n){
        int ans=0;
        int i=0;
        while(n>0){
            int rem=n%10;
            ans+=(int)Math.pow(2,i)*rem;
            n/=10;
            i++;
        }
        return ans;
    }
    // decimal to binary number conversion

    public static int decimalTobinary(int n){
        long  x=1,last_digit,ans=0;
        while(x<=n){
            x*=2;
        }
        x/=2;
        while(x>0){
            last_digit=n/x;
            n= (int) (n-last_digit*x);
            x/=2;
            ans=ans*10+last_digit;
        }
        return (int) ans;
    }
    // decimal to octa conversion
    public static int decimalToocta(int n){
        int x=1,last_digit,ans=0;
        while(x<=n){
            x*=8;
        }
        x/=8;
        while(x>0){
            last_digit=n/x;
            n=n-last_digit*x;
            x/=8;
            ans=ans*10+last_digit;
        }
        return ans;
    }
    // decimal to hexa conversion
    public static String decimalTohexa(int n){
        int x=1,last_digit;
        StringBuilder ans= new StringBuilder();
        while(x<=n){
            x*=16;
        }
        x/=16;
        while(x>0){
            last_digit=n/x;
            n=n-last_digit*x;
            x/=16;
            if(last_digit<10){
                ans.append(last_digit);
            }
            else{
                char ch=(char)(last_digit+55);
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = 0;
        boolean check=true;
        while(check) {
            System.out.println(ANSI_YELLOW+"......MAIN MENU........"+ANSI_RESET);
            System.out.println(ANSI_YELLOW+"""
                    ....................................
                    (1)decimal number.
                    (2)binary number.
                    (3)octa number.
                    (4)hexa number.
                    (5)for exit.
                    ...................................."""+ANSI_RESET);
            System.out.println("....Select the option what kind of value you want provide....");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println(ANSI_YELLOW + "Enter your decimal number" + ANSI_RESET);
                        num = sc.nextInt();

                    if (num > 0) {
                        num = num;
                    } else {
                        System.out.println("Enter only positive number");
                        num = sc.nextInt();
                    }
                    boolean check1=true;
                    while (check1) {
                        System.out.println(ANSI_YELLOW+"..... SUB MENU......."+ANSI_RESET);
                        System.out.println("""
                                ............................
                                (1)binary number.
                                (2)octa number.
                                (3)hexa number.
                                (4)for Exit to main menu.
                                ............................""");
                        System.out.println(".....select the choice to get result..... ");
                        int ch1 = sc.nextInt();
                        switch (ch1) {
                            case 1 -> System.out.println(ANSI_YELLOW + "Result for binary from decimal number= "
                                    + decimalTobinary(num) + ANSI_RESET);
                            case 2 -> System.out.println(ANSI_YELLOW + "Result for octa from decimal number= "
                                    + decimalToocta(num) + ANSI_RESET);
                            case 3 -> System.out.println(ANSI_YELLOW + "Result for hexa from decimal number= "
                                    + decimalTohexa(num) + ANSI_RESET);
                            case 4-> { check=true ; check1=false;}
                            default -> System.out.println(ANSI_BLACK+ "Please enter the correct choice" + ANSI_RESET);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Enter your binary number");
                    String str = sc.next();
                    int num1 = ToCheckBinery(str);
                    boolean check2=true;
                    while (check2) {
                        System.out.println(ANSI_YELLOW+"..... SUB MENU......."+ANSI_RESET);
                        System.out.println("""
                                ......................
                                (1)decimal number.
                                (2)octa number.
                                (3)hexa number.
                                (4)for exit to main menu.
                                ......................""");
                        System.out.println(".....select the choice to get result..... ");
                        int ch1 = sc.nextInt();
                        switch (ch1) {
                            case 1 -> System.out.println(ANSI_YELLOW + "Result for decimal from binary number= "
                                    + binaryTodecimal(num1) + ANSI_RESET);
                            case 2 -> System.out.println(ANSI_YELLOW + "Result for octa from binary number= "
                                    + binaryToocta(num1) + ANSI_RESET);
                            case 3 -> System.out.println(ANSI_YELLOW + "Result for hexa from binary number= "
                                    + binaryTohexa(num1) + ANSI_RESET);

                            case 4 -> { check2=false; check=true;}
                            default -> System.out.println(ANSI_BLACK+ "Please enter the correct choice" +
                                    ANSI_RESET);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Enter your octa number");
                    String str=sc.next();
                    num=ToCheckOctal(str);
                    boolean check3=true;
                    while (check3) {
                        System.out.println(ANSI_YELLOW+"..... SUB MENU......."+ANSI_RESET);
                        System.out.println("""
                                ........................
                                (1)decimal number.
                                (2)binary number.
                                (3)hexa number.
                                (4)for exit to main menu.
                                .........................""");
                        System.out.println(".....select the choice to get result..... ");
                        int ch1 = sc.nextInt();
                        switch (ch1) {
                            case 1 -> System.out.println(ANSI_YELLOW + "Result for decimal from octa number= " + OctaTodecimal(num) + ANSI_RESET);
                            case 2 -> System.out.println(ANSI_YELLOW + "Result for binary from octa number= " + OctaTobinary(num) + ANSI_RESET);
                            case 3 -> System.out.println(ANSI_YELLOW + "Result for hexa from octa number= " + OctaToHexa(num) + ANSI_RESET);
                            case 4 -> {
                                check3=false; check=true;
                            }
                            default -> System.out.println(ANSI_BLACK + "Please enter the correct choice" + ANSI_RESET);
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Enter your hexa number latter should be capital");
                    String num1 = sc.next();
                    String str="";
                    for (int i = 0; i < num1.length(); i++) {
                        if (num1.charAt(i) >= 'A' && num1.charAt(i) <= 'F' || num1.charAt(i) >= '0' && num1.charAt(i) <= '9') {
                            str+=num1.charAt(i);
                        } else {
                            System.out.println(ANSI_BLACK+"Enter correct hexa number \n" +
                                    " and alphabet should be less than G and capital"+ANSI_RESET);
                            num1 = sc.next();
                            break;
                        }
                    }
                    num1=str;
                    boolean check4=true;
                    while (check4) {
                        System.out.println(ANSI_YELLOW+"..... SUB MENU......."+ANSI_RESET);
                        System.out.println("""
                                ....................
                                (1)decimal number.
                                (2)binary number.
                                (3)octa number.
                                (4)for exit.
                                ....................""");
                        System.out.println(".....select the choice to get result..... ");
                        int ch1 = sc.nextInt();
                        switch (ch1) {
                            case 1 -> System.out.println(ANSI_YELLOW + "Result for decimal from hexa number= " + HexaToDecimal(num1) + ANSI_RESET);
                            case 2 -> {
                                System.out.println(ANSI_YELLOW + "Result for binary from hexa number= " + HexaToBinary(num1) + ANSI_RESET);
                            }
                            case 3 -> System.out.println(ANSI_YELLOW + "Result for octa from hexa number= " + HexaToOcta(num1) + ANSI_RESET);
                            case 4 -> {
                                check4=false; check=true;
                            }
                            default -> System.out.println(ANSI_BLACK + "Please enter the correct choice" + ANSI_RESET);
                        }
                    }
                }
                case 5 -> {
                    System.out.println(ANSI_WHITE_BACKGROUND + ANSI_YELLOW + ".....THANK YOU......" + ANSI_RESET + ANSI_RESET);
                    check=false;
                }
                default ->
                        System.out.println(ANSI_BLACK+ "....Please select only from given option.... " + ANSI_RESET);
            }

        }
    }
}
