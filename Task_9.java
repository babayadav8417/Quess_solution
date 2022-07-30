import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter array char element ");
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        System.out.println(findMissingLetter(arr));
    }
    public static char findMissingLetter(char[] array)
    {
        char st=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]!=st){
                return st;
            }
            st++;
        }
        return st;
    }
}
