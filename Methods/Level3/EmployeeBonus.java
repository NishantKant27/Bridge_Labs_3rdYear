import java.util.Random;

public class EmployeeBonus {

    // Method to generate Salary and Years of Service
    public static int[][] generateSalaryAndService(int size) {
        Random rand = new Random();
        int[][] data = new int[size][2];  // [salary, yearsOfService]
        for (int i = 0; i < size; i++) {
            int salary = 10000 + rand.nextInt(90000);  // random 5-digit salary
            int years = 1 + rand.nextInt(15);          // random years (1–15)
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate Bonus and New Salary
    public static double[][] calculateBonusAndNewSalary(int[][] oldData) {
        int size = oldData.length;
        double[][] newData = new double[size][2]; // [newSalary, bonus]
        for (int i = 0; i < size; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Method to display results in tabular format
    public static void displayResults(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-10s %-10s %-12s %-12s %-12s %-12s%n", 
                "EmpID", "Salary", "YearsService", "Bonus", "NewSalary", "Bonus%");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];
            String bonusPercent = (years > 5) ? "5%" : "2%";

            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-12d %-12.2f %-12.2f %-12s%n", 
                    (i + 1), salary, years, bonus, newSalary, bonusPercent);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-12s %-12.2f %-12.2f %-12s%n", 
                "TOTAL", totalOld, "", totalBonus, totalNew, "");
    }

    public static void main(String[] args) {
        int size = 10;

        int[][] oldData = generateSalaryAndService(size);
        double[][] newData = calculateBonusAndNewSalary(oldData);
        displayResults(oldData, newData);
    }
}
