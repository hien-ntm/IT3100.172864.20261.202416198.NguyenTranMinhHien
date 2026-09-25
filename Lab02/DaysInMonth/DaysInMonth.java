import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = -1;
        int year = -1;

        String[] fullName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] abbreviation = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] abbreviationWithDot = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.print("Enter a month: ");
            String monthInput = scanner.nextLine().trim();
            month = -1;
            for (int i = 0; i < 12; i++) {
                if (monthInput.equalsIgnoreCase(fullName[i]) ||
                    monthInput.equalsIgnoreCase(abbreviation[i]) ||
                    monthInput.equalsIgnoreCase(abbreviationWithDot[i]) ||
                    monthInput.equals(number[i])) {
                    month = i + 1;
                    break;
                }
            }
            if (month == -1) {
                System.out.println("Invalid month. Please try again.\n");
                continue;
            }

            System.out.print("Enter a year: ");
            String yearInput = scanner.nextLine().trim();
            year = -1;
            if (yearInput.matches("\\d+")) { 
                year = Integer.parseInt(yearInput);
            }
            if (year < 0) {
                System.out.println("Invalid year. Please try again.\n");
                continue;
            }
            
            break;
        }

        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = (leapYear && month == 2) ? 29 : daysInMonth[month - 1];
        System.out.println("Number of days: " + days);

        scanner.close();
    }
}
