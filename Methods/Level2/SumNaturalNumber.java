import java.util.Scanner;
public class SumNaturalNumber {
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + recursiveSum(n - 1); 
    }
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
        } else {
            int sumRecursive = recursiveSum(n);
            int sumFormula = formulaSum(n);
            System.out.println("Sum of first " + n + " natural numbers (Recursive) = " + sumRecursive);
            System.out.println("Sum of first " + n + " natural numbers (Formula)   = " + sumFormula);
            if (sumRecursive == sumFormula) {
                System.out.println("✅ Both methods give the same result. The computation is correct.");
            } else {
                System.out.println("❌ Results do not match. Something went wrong.");
            }
        };
    }
}
