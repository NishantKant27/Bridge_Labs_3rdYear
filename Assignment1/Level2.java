import java.util.Scanner;
public class Level2 {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        // Q1
        // System.out.println("Harry's age in 2024 is "+ (2024-2000));

        // Q2
        // System.out.println("Sam's average mark in PCM is "+ (95+94+96)/3);

        // Q3
        // System.out.println("The distance "+ 10.8 +" km in miles is "+ (1.6*10.8));

        // Q4
        // int cp=129;
        // int sp=191;
        // System.out.println("The Cost Price is INR "+ cp +" and Selling Price is INR "+ sp);
        // System.out.println("The Profit is INR "+ (sp-cp) +" and the Profit Percentage is "+((float)(sp-cp)/cp)*100 );

        // Q5
        // int pen=14;
        // int nu_St=3;
        // int mod=14%3;
        // pen=pen-mod;
        // System.out.println( "The Pen Per Student is "+ pen/nu_St +" and the remaining pen not distributed is "+ mod);
        
        // Q6
        // int fee=125000;
        // int discountPer=10;
        // int discount=fee*discountPer/100;
        // int fin=fee-discount;
        // System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ fin );

        // Q7
        // int rad=6378;
        // double vol=(4/3)(22/7)(rad*rad*rad);
        // double vol_mile=vol*1.6;
        // System.out.println("The volume of earth in cubic kilometers is "+vol+ " and cubic miles is "+vol_mile);

        // Q8
        // double km=scn.nextDouble();
        // double mile=km*1.6;
        // System.out.println("The total miles is "+ mile +" mile for the given "+ km + "km");

        // Q9
        // int fee=scn.nextInt();
        // int discountPer=scn.nextInt();
        // int discount=fee*discountPer/100;
        // int fin=fee-discount;
        // System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ fin );

        // Q10
        // double height=scn.nextDouble();
        // double inc=height/2.54;
        // double foot=inc/12;
        // System.out.println("Your Height in cm is "+ height +" while in feet is "+ foot +" and inches is "+inc);

        // Q11
        // float number1=scn.nextFloat();
        // float number2=scn.nextFloat();
        // float add=number1+number2;
        // float sub=number1-number2;
        // float mul=number1*number2;
        // float div=number1/number2;
        // System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 + " is "+add+ ","+sub+ ","+mul+" and "+div);

        // Q12
        // int height=scn.nextInt();
        // int base=scn.nextInt();
        // float area=(base*height)/2;
        // double inc=area/2.54;
        // System.out.println("The Height and base of triangle is "+height+" , "+base +" and the area is "+area+" in inches "+ inc);

        // Q13
        // int perimeter=scn.nextInt();
        // int length=perimeter/4;
        // System.out.println("The length of the side is "+length +" whose perimeter is "+perimeter);

        // Q14

        // int distaInfeet=scn.nextInt();
        // double yard=distaInfeet/3;
        // double mile=yard/1760;
        // System.out.println("Your distance in feet is "+distaInfeet+" while in yard is "+yard+" and in miles is "+ mile);

        // Q15
        // int unit=scn.nextInt();
        // int quan=scn.nextInt();
        // int total=unit*quan;
        // System.out.println("The total purchase price is INR "+total+" if the quantity "+quan+" and unit price is INR "+unit);

        // Q16
        int N=scn.nextInt();
        float maxx=(N*(N-1))/2;
        System.out.println("The number of Students "+N+" and there possible number of handshakes "+maxx);
    }
}
