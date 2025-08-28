import java.util.*;
public class Level2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        // Q1
        // int n=scn.nextInt();
        // System.out.println("Is the number "+n+" divisible by 5?");
        // if(n%5==0){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println(" No");
        // }

        // Q2
        // int num1=scn.nextInt();
        // int num2=scn.nextInt();
        // int num3=scn.nextInt();
        // System.out.println("Is the num1 is smallest?");
        // if(num1<num2 && num1<num3){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }

        // Q3
        // int num1=scn.nextInt();
        // int num2=scn.nextInt();
        // int num3=scn.nextInt();
        // System.out.println("Is the num1 is Largest?");
        // if(num1>num2 && num1>num3){
        //     System.out.println("Yes");
        // }
        // else {
        //     System.out.println("No");
        // }
        // System.out.println("Is the num2 is Largest?");
        // if(num2>num1 && num2>num3){
        //     System.out.println("Yes");
        // }
        // else {
        //     System.out.println("No");
        // }
        // System.out.println("Is the num3 is Largest?");
        // if(num3>num2 && num3>num1){
        //     System.out.println("Yes");
        // }
        // else {
        //     System.out.println("No");
        // }

        // Q4
        // int number=scn.nextInt();
        // if(number>0){
        //     int y=number*(number+1)/2;
        //     System.out.println("The sum of "+number +" natural number is "+y);
        // }
        // else{
        //     System.out.println("The number is not natural number");
        // }

        // Q5
        // int age=scn.nextInt();
        // if(age>=18){
        //     System.out.println("The person's age is "+age+" and can vote.");
        // }
        // else{
        //     System.out.println("The person's age is "+age+" and cannot vote.");
        // }

        // Q6
        // int num=scn.nextInt();
        // if(num<0){
        //     System.out.println("Negative");

        // }
        // else if(num>0){
        //     System.out.println("Positive");
        // }
        // else{
        //     System.out.println("Zero");
        // }

        // Q7
        // int date=scn.nextInt();
        // String month=scn.next();
        // if(month.equals("april") || month.equals("may")){
        //     System.out.println("Its a spring season");
        // }
        // else if((date>20 && date<31 && month.equals("march")) || (date>1 && date<20 && month.equals("june"))){
        //     System.out.println("Its a spring season");
        // }
        // else{
        //     System.out.println("Not a Spring Season");
        // }

        // Q8
        // int num=scn.nextInt();
        // while(num>0){
        //     System.out.println(num);
        //     num--;
        // }

        // Q9
        // int num=scn.nextInt();
        // for(int i=num;i>0;i--){
        //     System.out.println(num);
            
        // }

        // Q10
        // double numbers=scn.nextInt();
        // double sum=0;
        // while(numbers!=0){
        //     sum+=numbers;
        //     double y=scn.nextInt();
        //     numbers=y;

        // }
        // System.out.println(sum);

        // Q11
        // int sum=0;
        // while(true){
        //     int N=scn.nextInt();
        //     if(N>0){
        //         sum+=N;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // System.out.println(sum);

        // Q12
        // int n=scn.nextInt();
        // if(n>0){
        //     int y=n*(n+1)/2;
        //     int sum=0;
        //     while(n>0){
        //         sum+=n;
        //         n--;
        //     }
        //     if(sum==y){
        //         System.out.println(sum);
        //     }
        //     else{
        //         System.out.println("Not equal");
        //     }
        // }
        // else{
        //     System.out.println("Not Natural Number");
        // }


        // Q13
         // int n=scn.nextInt();
        // if(n>0){
        //     int y=n*(n+1)/2;
        //     int sum=0;
        //     for(int i=n;i>0;i--){
        //         sum+=n;
        //         
        //     }
        //     if(sum==y){
        //         System.out.println(sum);
        //     }
        //     else{
        //         System.out.println("Not equal");
        //     }
        // }
        // else{
        //     System.out.println("Not Natural Number");
        // }

        // Q14
        // int n=scn.nextInt();
        // if(n>0){
        //     int mul=1;
        //     while(n>0){
        //         mul*=n;
        //         n--;
        //     }
        //     System.out.println(mul);
        // }
        // else{
        //     System.out.println("You have entered negative number");
        // }


        // Q15
        int n=scn.nextInt();
        if(n>0){
            int mul=1;
            for(int i=1;i<=n;i++){
                mul*=i;
                
            }
            System.out.println(mul);
        }
        else{
            System.out.println("You have entered negative number");
        }

        



    }
}