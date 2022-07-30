import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin can have digit");
        String str= sc.next();
        if(validatePin(str))
            System.out.println("Your pin is valid ");
        else
            System.out.println("Your pin is not valid ");
    }
    public static boolean validatePin(String pin) {
        // Your code here...
        if(pin.length()==4 || pin.length()==6){
            for(int i=0;i<pin.length();i++){
                if(!(pin.charAt(i)>='0' && pin.charAt(i)<='9'))
                    return false;
            }
            return true;
        }
        return false;
    }
}
