import java.util.Scanner;
public class FriendsComparison {
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        return names[index] + " (Age: " + minAge + ")";
    }
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        return names[index] + " (Height: " + maxHeight + " m)";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < friends.length; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in meters) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }
        String youngest = findYoungest(friends, ages);
        String tallest = findTallest(friends, heights);
        System.out.println("\nYoungest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);
    }
}
