package ConvertDate;
import java.util.Scanner;

public class Main {
    private static boolean isValidDateFormat(String date)
    {
        return date.matches("\\d{4}-\\d{2}-\\d{2}");
    }
    private static String getMonthName(int month) {
        String[] monthNames = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month];
    }
    public static String convertDate(String date)
    {
        if (isValidDateFormat(date))
        {
            String[] dateParts = date.split("-");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);

            String monthName = getMonthName(month);
            return monthName + " " + day + ", " + year;
        } else {
            return "Invalid Date! Please follow the format YYYY-MM-DD.";
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter a short date (YYYY-MM-DD): ");
        System.out.println(" Full Date: " + convertDate(input.nextLine()));
        input.close();
    }
}