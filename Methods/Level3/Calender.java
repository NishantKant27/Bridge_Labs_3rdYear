import java.util.Scanner;
public class Calender {

    static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    static int getFirstDay(int month, int year) {
        // Zeller’s Congruence Algorithm
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;      // year of the century
        int j = year / 100;      // zero-based century
        int h = (1 + (13 * (month + 1)) / 5 + k + k/4 + j/4 + (5 * j)) % 7;
        int day = ((h + 5) % 7); // 0 = Sunday, 1 = Monday...
        return day;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDay(month, year);

        System.out.printf("\n     %s %d\n", monthName, year);
        System.out.println(" Su Mo Tu We Th Fr Sa");

        // First loop for spacing before 1st day
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Second loop to print all days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
