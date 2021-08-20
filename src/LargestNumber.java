import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // object from scanner class
        int num1, num2, num3, largest, temp;

        // reading inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        num1 = sc.nextInt();

        System.out.println("Enter second number ");
        num2 = sc.nextInt();

        System.out.println("Enter third number ");
        num3 = sc.nextInt();

        //comparing num1 and num2
        temp = num1 > num2 ? num1 : num2;

        //comparing temp variable with num3
        largest = num3 > temp ? num3 : temp;

        //prints largest number
        System.out.println("The largest number is: " +largest);
    }
}
