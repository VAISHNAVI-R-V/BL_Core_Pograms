import java.util.Scanner;

public class LapYear {
    public static void main(String[] args) {

        System.out.println("Enter the year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        LeapYear(year);
    }

    //Check Leap Year
    //Ensure the year is a 4 digit
    private static void LeapYear(int year) {
        int count = 0;
        int CheckYear = year;
        while (year != 0) {
            year = year / 10;
            ++count;
        }
        if (count == 4 && CheckYear > 0) {
            if ((CheckYear % 4 == 0) && (CheckYear % 100 != 0) || (CheckYear % 400 == 0))
                System.out.println("entered year is a leap year");
            else
                System.out.println("entered year is not a leap year");
        }
    }
}
