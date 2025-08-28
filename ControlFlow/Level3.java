import java.util.Scanner;
public class Level3 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        // Q1
        // int n=scn.nextInt();
        // if(n>0){
        //     for(int i=1;i<=n;i++){
        //         if(i%2==0){
        //             System.out.println(i +" even");
        //         }
        //         else{
        //             System.out.println(i +" odd");
        //         }
        //     }
        // }
        // else{
        //     System.out.println("You have not enetered natural number");
        // }

        // Q2
        // int salary=scn.nextInt();
        // int year=scn.nextInt();
        // if(year>5){
        //     int bonus=salary*5/100;
        //     salary+=bonus;
        //     System.out.println("Bonus amount is "+bonus);

        // }
        // else{
        //     System.out.println("bonus amount==0");
        // }

        // Q3
        // int n=scn.nextInt();
        // for(int i=6;i<=9;i++){
        //     System.out.println(n+" * "+i+" = "+i*n);
        // }

        // Q4
        // int n=scn.nextInt();
        // if(n>0){
        //     for(int i=1;i<=n;i++){
        //         if(i%3==0 &&i%5==0){
        //             System.out.println(i+" FizzBuzz");
        //         }
        //         else if(i%3==0){
        //             System.out.println(i+" Fizz");
        //         }
        //         else if(i%5==0){
        //             System.out.println(i+" Buzz");
        //         }
        //     }
        // }
        // else{
        //     System.out.println("Negative number");
        // }

    

        // Q5
        // int n=scn.nextInt();
        // if(n>0){
        //     int i=1;
        //     while(i<=n){
        //         if(i%3==0 &&i%5==0){
        //             System.out.println(i+" FizzBuzz");
        //         }
        //         else if(i%3==0){
        //             System.out.println(i+" Fizz");
        //         }
        //         else if(i%5==0){
        //             System.out.println(i+" Buzz");
        //         }
        //         i++;
        //     }
        // }
        // else{
        //     System.out.println("Negative number");
        // }

        // Q6
        // System.out.println("Enter the ages ");
        // int AmarAge=scn.nextInt();
        // int AkbarAge=scn.nextInt();
        // int AnthonyAge=scn.nextInt();
        // System.out.println("Enter the heights");
        // int AmarHeight=scn.nextInt();
        // int AkbarHeight=scn.nextInt();
        // int AnthonyHeight=scn.nextInt();
        // if(AmarAge<AkbarAge && AmarAge<AnthonyAge){
        //     System.out.println("Amar is the youngest");
        // }
        // else if(AkbarAge<AmarAge && AkbarAge<AnthonyAge){
        //     System.out.println("Akbar is the youngest");
        // }
        // else{
        //     System.out.println("Anthony is the youngest");
        // }
        // if(AmarHeight>AkbarHeight && AmarHeight>AnthonyHeight){
        //     System.out.println("Amar is the tallest");
        // }
        // else if(AkbarHeight>AmarHeight && AkbarHeight>AnthonyHeight){
        //     System.out.println("Akbar is the tallest");
        // }
        // else{
        //     System.out.println("Anthony is the tallest");
        // }

        // Q7
        // int n=scn.nextInt();
        // if(n>0){
        //     for(int i=1;i<=n;i++){
        //         if(n%i==0){
        //             System.out.println(i);
        //         }
        //     }
        // }
        // else{
        //     System.out.println("Number is negative");
        // }

        // Q8
        // int n=scn.nextInt();
        // if(n>0){
                // int i=0;
        //     while(i<=n){
        //         if(n%i==0){
        //             System.out.println(i);
        //         }
                    // i++;
        //     }
        // }
        // else{
        //     System.out.println("Number is negative");
        // }

        // Q9

        // int n=scn.nextInt();
        // if(n>0){
        //     for(int i=n-1;i>0;i--){
        //         if(n%i==0){
        //             System.out.println(i);
        //             break;
        //         }
        //     }
        // }
        // else{
        //     System.out.println("Number is negative");
        // }

        // Q10
        // int n=scn.nextInt();
        // if(n>0){
        //     int i=n-1;
        //     while(i>=1){
        //         if(n%i==0){
        //             System.out.println(i);
        //             break;
        //         }
        //         i--;
        //     }
        // }
        // else{
        //     System.out.println("Number is negative");
        // }

        // Q11
        // int n=scn.nextInt();
        // if(n>0 && n<=100){
        //     for(int i=n-1;i>0;i--){
        //         if(n%i==0){
        //             System.out.println(i);
                    
        //         }
        //     }
        // }
        // else{
        //     System.out.println("Number is negative");
        // }


        // Q12
        // int n=scn.nextInt();
        // int pow=scn.nextInt();
        // int val=1;

        // for(int i=1;i<=pow;i++){
        //     val*=n;
        // }

        // System.out.println(val);
        

        // Q13
        // int n=scn.nextInt();
        // if(n>0){
        //     int i=n-1;
        //     while(i>=1){
        //         if(n%i==0){
        //             System.out.println(i);
        //             break;
        //         }
        //         i--;
        //     }
        // }
        // else{
        //     System.out.println("Number is negative");
        // }

        // Q14
        int n=scn.nextInt();
        int pow=scn.nextInt();
        int val=1;

        while(pow>0){
            val*=n;
            pow--;
        }

        System.out.println(val);




    }
}