
//Declare a class name ‘A’ with some methods and one parameterised constructor.
// Derive another class ‘B’ from ‘class A’. In class B have some methods and parameterized constructor.
// Derive Class C from class B Demonstrate how base class parameterised constructor
// gets call from child class constructor in multilevel inheritance


import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.Callable;

public class Optional_task_Superclass {
    public static void main(String[] args) {

        C obj=new C(20,"Allahabad");

       obj.demoC(22,"01/05/1998");
       obj.showfun();
    }
}
class A{
    protected String name="baba yadav";
    protected  int age;
    protected  char gender='M';
    protected String dateOfBirth;

    public A(int x,String str){
        age=x;
        dateOfBirth=str;
        System.out.println("This is class A and  my age ="+age+"\n"+"this is my date of birth ="+dateOfBirth);
    }
   public void show(){
       System.out.println("This is calss A and my name ="+name+"\n"+"this is my gender ="+gender);
   }
}
class B extends A{


    private static final String str ="01/03/2000" ;
    private static final int x =30 ;

    public B(int x, String str) {
        super(x, str);
    }

    public void showfun(){
        name="Satyawan";
        System.out.println(" class B and Name: "+name+"\n"+"Gender: "+gender);
    }
    public B(){
        super(x,str);

    }

}
class C extends  B{
    protected int roll;
    protected String address;

    public C() {

    }

    public void demoC(int x,String str){
        age=x;
        dateOfBirth=str;
        System.out.println("This is class C and  my age ="+age+"\n"+"this is my date of birth ="+dateOfBirth);
    }
    public C(int x1,String str1){
        roll=x1;
        address=str1;
        System.out.println(" class C and Rollnumber ="+roll+"\n"+"address ="+address);
    }
}