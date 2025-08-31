import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0; 
        return weight / (heightMeters * heightMeters);
    }
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] bmiStatus = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            double height = scanner.nextDouble();
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            data[i][0] = weight;
            data[i][1] = height;
            data[i][2] = bmi;
            bmiStatus[i] = status;
        }
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }
    }
}
