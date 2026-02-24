import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        int year = 365;
        int month = 30;
        int years = days / year;
        int remaining_days = days % year;
        int months = remaining_days / month;
        int remainingDays = remaining_days % month;
        System.out.println("Equivalent duration:");
        System.out.println(years + " year(s), " + months + " month(s), " + remainingDays + " day(s)");

        
    }
}
