//Create any class having data member of array type of size 5. Ask 5 values to user ,
// Write a constructor to pass the arguments to array. Use copy constructor to create
// another object that will have values copied from first array and add the second object
// should be the square of first array.


import java.util.Scanner;

public class Optinal_taskOfConstructor {
    int n;
    int[] arr=new int[20];
    Optinal_taskOfConstructor(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        n= sc.nextInt();
        System.out.println("Enter "+n+" array element ");
        for(int i=0;i< n;i++){
            arr[i]=sc.nextInt();
        }
    }
    Optinal_taskOfConstructor(Optinal_taskOfConstructor ref){
        int[] arr2=new int[ref.n];
        for(int i=0;i< arr2.length;i++){
            arr2[i]=(int)Math.pow(ref.arr[i],2);
        }
        System.out.println("The output of array element after implementing the requirement ");
        for(int i=0;i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

    public static void main(String[] args) {
        Optinal_taskOfConstructor obj=new Optinal_taskOfConstructor();
        Optinal_taskOfConstructor obj1=new Optinal_taskOfConstructor(obj);


    }
}
