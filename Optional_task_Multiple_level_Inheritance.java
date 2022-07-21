import java.util.Scanner;

public class Optional_task_Multiple_level_Inheritance {
    public static void main(String[] args) {
        sportCar1 obj=new sportCar1();
        obj.setType();
        obj.setwheel();
        obj.setColour();
        obj.setOil();
        System.out.println("this is my type of vehicle....>>> "+obj.getType());
        System.out.println("this is colour of car....>>>>>>>> "+obj.getColour());
        System.out.println("this is number of wheel in car.....>>"+obj.getNo_of_wheel());
        System.out.println("this is oil available in car...>> "+obj.getoil());
    }
}
class vahical{
    String Type;
    public void setType(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of vehicle");
        Type=sc.next();
    }
}

class car1 extends vahical{

    int wheel;
    String colour;
    int oil;
    Scanner sc=new Scanner(System.in);

    public void setwheel() {
        System.out.println("Enter number of wheel in car");
        wheel= sc.nextInt();
    }
    public void setColour(){
        System.out.println("Enter the colour of car");
        colour=sc.next();
    }
    public void setOil(){
        System.out.println("Enter the number as you want to tell oil present in car");
        oil= sc.nextInt();
    }
}
class sportCar1 extends car1{

    public int getNo_of_wheel(){
        return wheel;
    }
    public String getColour(){
        return colour;
    }
    public int getoil(){
        return oil;
    }
    public  String getType(){
        return Type;
    }
}