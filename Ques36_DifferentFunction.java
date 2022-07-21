import java.util.Arrays;
import java.util.Scanner;

public class Ques36_DifferentFunction {
        public int[] insertX(int[] arr, int n, int pos, int val) {
            int[] newarr;
            if(pos>n) {
                newarr = new int[pos+1];
                for(int i=0;i<pos+1;i++){
                    if(i<n)
                    newarr[i]=arr[i];
                    if(i==pos){
                        newarr[pos]=val;
                    }
                }
            }
             else   {
                newarr = new int[n + 1];
                    for(int i=0;i<=n;i++){
                        if(i<pos)
                            newarr[i] = arr[i];
                        else if(i==pos){
                            newarr[i]=val;
                        }
                        else {
                            newarr[i] = arr[i - 1];
                        }
                    }
            }
            return newarr;
        }

        public int[] removeTheElement(int[] arr, int index) {
            if (arr != null && index >= 0 && index < arr.length) {
                int[] anotherArray = new int[arr.length - 1];
                int i = 0;

                for(int k = 0; i < arr.length; ++i) {
                    if (i != index) {
                        anotherArray[k++] = arr[i];
                    }
                }

                return anotherArray;
            } else {
                return arr;
            }
        }

        public int searching(int[] num, int k) {
            Arrays.sort(num);
            int st = 0;
            int en = num.length - 1;

            while(st <= en) {
                int mid = (st + en) / 2;
                if (num[mid] < k) {
                    st = mid + 1;
                } else {
                    if (num[mid] == k) {
                        return mid;
                    }

                    en = mid - 1;
                }
            }
            return -1;
        }

        public void Output(int[] arr) {
            System.out.print("[");

            for(int val:arr) {
                System.out.print(val + ",");
            }

            System.out.println("]");
        }

        public void Input(int[] arr, int n) {
            Scanner sc = new Scanner(System.in);

            for(int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }

        }
        public int Sum(int []arr){
            int sum=0;
            for(int val:arr){
              sum+=val;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Ques36_DifferentFunction obj = new Ques36_DifferentFunction();
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("first insert element in array");
            obj.Input(arr, n);
            while(true) {
                System.out.println("\n\n");
                System.out.println("......You have to select anyone from given option.......");
                System.out.println("""
                        (1) for insert.
                        (2) for delete.
                        (3)  for searching.\s
                        (4) for display your array element.
                        (5) for sum of array element.
                        (6) for exit.""");
                System.out.println("........................................................");

                System.out.println("Enter  your choice");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1 -> {
                        System.out.println("This is your original array element ");
                        obj.Output(arr);
                        System.out.println("\nenter at what position you want insert remember it will count from 0");
                        int index1 = sc.nextInt();
                        n = arr.length;
                        if (index1 < 0 || index1>n) {
                            System.out.println("\n....Sorry Sir we are unable to help you because position can't be negative......");
                        } else {
                            System.out.println("Enter the value");
                            int value = sc.nextInt();
                            arr = obj.insertX(arr, n, index1, value);
                            System.out.println("\nArray with " + value + " inserted at position " + index1 +
                                    ":\n" + Arrays.toString(arr));
                        }
                    }
                    case 2 -> {
                        System.out.println("....Original Array before deletion :.... " + Arrays.toString(arr));
                        if(arr.length==0){
                            System.out.println("....No element are there in array please insert....");
                        }
                        else {
                            System.out.println("\n select index to delete value remember include index 0 too");
                            int index = sc.nextInt();
                            if (index < 0) {
                                System.out.println("....Sorry Sir we are unable to help you because position can't be negative......");
                            }
                            else if(index> arr.length){
                                System.out.println("....Array's size is less Please provide correct position....");
                            }
                            else {
                                arr = obj.removeTheElement(arr, index);
                                System.out.println("Resultant Array after deleting " + Arrays.toString(arr));
                            }
                        }
                    }
                    case 3 -> {
                        if (arr.length == 0) {
                            System.out.println(".......Sorry there is no any element to search.......");
                        } else {
                            System.out.println("Enter key element for searching");
                            int key = sc.nextInt();
                            if (obj.searching(arr, key) > 0) {
                                System.out.print("\n....Congratulation your given value is present in array at position= " + (obj.searching(arr, key)) + " from starting index 0 ......");
                            } else {
                                System.out.println("....Sorry sir/Mam we are unable to help you because your given value is not present in array....");
                            }
                        }
                    }
                    case 4 -> {
                        System.out.print("\nThe output of Your array is....= ");
                        obj.Output(arr);
                    }
                    case 5-> {
                        if(arr.length==0){
                            System.out.println("....there is no element in array to get sum....");
                        }
                        else {
                            System.out.println("Sum of array element is....=" + obj.Sum(arr));
                        }
                    }
                    case 6 -> {
                        System.out.print("....Thank you Sir/Mam for participating in this awesome game....\n\s....It was really nice meeting with you....");
                        System.exit(0);
                    }
                    default -> System.out.println("Please enter only from given option ");
                }
            }
    }
}
