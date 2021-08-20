import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        System.out.println("Enter the number of times you want to Flip the Coin");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double tailcount = 0;
        double headcount = 0;
        double coinResult;

        for (int i = 1; i <= count; i++) {
            coinResult = Math.random();
            System.out.println(coinResult);

            if (coinResult < 0.5) {
                tailcount++;
            } else {
                headcount++;
                //System.out.println("Heads");
            }
        }
        System.out.println("Heads: " +headcount);
        System.out.println("Tails: "+tailcount);

    }
}