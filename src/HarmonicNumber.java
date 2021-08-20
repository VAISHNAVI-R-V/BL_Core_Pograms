import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("Enter a value of Nth Harmonic");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n != 0)
            harmonicValue(n);
        else
            System.out.println("Incorrect value! N cannot be 0");
    }

    private static void harmonicValue(int number) {
        float harmonic = 1;
        System.out.println("The Harmonic series is : ");

        // to print series
        for (int i =1; i <=number; i++) {
            if ( i!=number ) {
                System.out.println("1/" +i+ " + ");
            }
            else {
                System.out.println("1/" + i);
            }
        }

        // to print sum of number
        for (int i = 2; i <= number; i++) {
            harmonic += (float)1.00 / i;
        }
        System.out.println("The sum of Nth Harmonic Value is : " +harmonic);
    }
}
