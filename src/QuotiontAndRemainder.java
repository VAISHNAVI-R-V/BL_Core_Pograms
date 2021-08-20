import java.util.Scanner;

public class QuotiontAndRemainder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int dn, dr, qu, rem;
        // dn - denotes the dividend
        // dr -  denotes the divisor
        // qu -denotes the Quotient
        // rem - denotes the remainder

        System.out.println("Enter the dividend & divisor to compute the quotient and remainder; ");
        dn = in.nextInt();
        dr = in.nextInt();

        // Computes the quotient
        qu = dn / dr;

        // Computes the remainder
        rem = dn % dr;

        System.out.println("\nThe Quotient is " + qu);
        System.out.println("The Remainder is " + rem);
    }
}
