import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        System.out.println("Enter the Values of X and Y ");
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println("Calculate the Euclidean distance from point ( X, Y ) to the origin (0, 0).");
        euclideanDistance(X,Y);
    }

    private static void euclideanDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("The Euclidean distance is: " +distance+ " units.");
    }
}
