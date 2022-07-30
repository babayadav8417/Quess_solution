import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int x= sc.nextInt();
        String str[] = new String[x];
        if(x>0) {
            System.out.println("Enter your string ");
            for (int i = 0; i < x; i++) {
                str[i] = sc.next();
            }
        }
        System.out.println(whoLikesIt(str));
    }
    public static String whoLikesIt(String... names) {
        if(names.length==0){
            return "no one likes this";
        }
        else if(names.length==1){
            return names[0]+" likes this";
        }
        else if(names.length==2){
            return names[0]+" and "+names[1]+" like this";
        }
        else if(names.length==3){
            return names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        else{
            int n=names.length-2;
            return names[0]+", "+names[1]+" and "+ n +" others like this";
        }
    }
    }

