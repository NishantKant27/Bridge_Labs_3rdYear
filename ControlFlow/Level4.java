import java.util.Scanner;
public class Level4 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        // Q1
        // int year=scn.nextInt();
        // if(year%4==0){
        //     if(year%100==0){
        //         if(year%400==0){
        //             System.out.println("Leap Year");
        //         }
        //         else{
        //             System.out.println("Not leap year");
        //         }
        //     }
        //     else{
        //         System.out.println("Not leap year");
        //     }
        // }
        // else{
        //     System.out.println("Not leap year");
        // }


        // Q2

        //  int year = scn.nextInt();

        // if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
        //     System.out.println(" Leap Year");
        // } else {
        //     System.out.println( " Not a Leap Year");
        // }

        // Q3
        // int phy=scn.nextInt();
        // int che=scn.nextInt();
        // int math=scn.nextInt();
        // int val=(phy+che+math)/3;
        // if(val>=80){
        //     System.out.println("Average marks is "+val+" Grade is A and remarks is Level 4 ");
        // }
        // else if(val>=70 && val<=79){
        //     System.out.println("Average marks is "+val+" Grade is B and remarks is Level 3 ");
        // }
        // else if(val>=60 && val<=69){
        //     System.out.println("Average marks is "+val+" Grade is C and remarks is Level 2 ");
        // }
        // else if(val>=50 && val<=59){
        //     System.out.println("Average marks is "+val+" Grade is D and remarks is Level 1 ");
        // }
        // else if(val>=40 && val<=49){
        //     System.out.println("Average marks is "+val+" Grade is E and remarks is Level 1- ");
        // }
        // else{
        //     System.out.println("Average marks is "+val+" Grade is R and remarks is Remedial standards ");
        // }

        // Q4
        // int num=scn.nextInt();
        // int c=1;
        // for(int i=2;i<num;i++){
        //     if(num%i==0){
        //         c++;
        //     }
        // }
        // if(c==1){
        //     System.out.println("Prime Number");
        // }
        // else{
        //     System.out.println("Not Prime Number");
        // }

        // Q5

        // int n=scn.nextInt();
        // int y=n;
        // int k=n;
        // int arm=0;
        // int cnt=0;
        // while(y!=0){
        //     y=y/10;
        //     cnt++;
        // }
        // while(k!=0){
        //     int r=k%10;
        //     arm+=Math.pow(r, cnt);
        //     k=k/10;

        // }
        // if(arm==n){
        //     System.out.println("Armstrong Number");
        // }
        // else{
        //     System.out.println("Not armstrong");
        // }

        // Q6

        // int n=scn.nextInt();
        // int y=n;
        // int cnt=0;
        // while(y!=0){
        //     y=y/10;
        //     cnt++;
        // }
        // System.out.println(cnt);

        // Q7
        // double weight=scn.nextDouble();
        // double height=scn.nextDouble();
        // double height_mete=height/100;
        // double BMI=weight/(height_mete*height_mete);
        // if(BMI<=18.4){
        //     System.out.println("Underweight");
        // }
        // else if(BMI>=18.5 && BMI<=24.9){
        //     System.out.println("Normal");
        // }
        // else if(BMI>=25 && BMI<=39.9){
        //     System.out.println("Overweight");
        // }
        // else{
        //     System.out.println("Obsese");
        // }

        // Q8
        // int n=scn.nextInt();
        // int y=n;
        // int sum=0;
        // while(y!=0){
        //     int r=y%10;
        //     sum+=r;
        //     y=y/10;
        // }
        // if(n%sum==0){
        //     System.out.println("Harshad Number");
        // }
        // else{
        //     System.out.println("Not Harshad Number");
        // }

        // Q9
        // int n=scn.nextInt();
        // int sum=0;
        // for(int i=1;i<n;i++){
        //     if(n%i==0){
        //         sum+=i;
        //     }
        // }
        // if(sum>n){
        //     System.out.println("Abundant Number");
        // }
        // else{
        //     System.out.println("Not Abundant Number");
        // }

        // Q10
        // double num1=scn.nextDouble();
        // double num2=scn.nextDouble();
        // String op=scn.next();
        // switch(op){
        //     case "+":
        //         System.out.println(num1+num2);
        //         break;
            
        //     case "-":
        //         System.out.println(num1-num2);
        //         break;
            
        //     case "*":
        //         System.out.println(num1*num2);
        //         break;
            
        //     case "/":
        //         System.out.println(num1/num2);
        //         break;
        //     default :
        //         System.out.println("invalid operation");
        //         break;
            
        // }

        // Q11
        int m=scn.nextInt();
        int d=scn.nextInt();
        int y=scn.nextInt();
        int y0=y-(14-m)/12;
        int x=y0 +y0/4 -y0/100+y0/400;
        int m0=m+12*((14-m)/12)-2;
        int d0=(d+x+31*m0/12)%7;

        switch(d0){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        } 
    }
}
