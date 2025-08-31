import java.util.Scanner;

public class StudentMarks {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 41 + 60); 
            scores[i][1] = (int) (Math.random() * 41 + 60); 
            scores[i][2] = (int) (Math.random() * 41 + 60); 
        }
        return scores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);

        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", 
                          "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f%n", 
                              scores[i][0], scores[i][1], scores[i][2], total, average, percentage);
        }
    }
}
