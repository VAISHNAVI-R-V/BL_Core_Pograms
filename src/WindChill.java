import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of temperature in Fahrenheit: ");
        double t = input.nextDouble();            //t=temperature

        System.out.println("Enter the speed of wind in miles per hour: ");
        double v = input.nextDouble();            //v=speed of wind

        if ( Math.abs(t) <= 50 ){
            if ( v >= 3 && v <=120 ) {
                calculateChill(t,v);
            }
            else
                System.out.println("Not Valid! v cannot be larger than 120 or less than 3");
        }
        else
            System.out.println("Not Valid! t cannot be larger than 50 in absolute value");
    }

    private static void calculateChill(double t, double v) {

        double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind chill value is: " +wind+ " units.");
    }
}
