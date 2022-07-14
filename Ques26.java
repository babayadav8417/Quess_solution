import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter electricity unit charge for calculating the electricity bill ");
        double unitCharge =sc.nextDouble();
        if(unitCharge<=50){
            unitCharge=unitCharge*.50;
        }
        else if (unitCharge>50 && unitCharge<=150) {
            unitCharge=25+(unitCharge-50)*0.75;
        }

        else if (unitCharge>150 && unitCharge<=250) {
            unitCharge=25+75+(unitCharge-150)*1.20;
        }
        else {

            unitCharge=25+75+120+(unitCharge-250)*1.50;
        }
        double Surchaarge=unitCharge*.20;
        unitCharge+=Surchaarge;
        System.out.println("here is your total electricity bill calculation  ...= "+unitCharge+" Rupees\n"+"----thank you-----");
    }
}
