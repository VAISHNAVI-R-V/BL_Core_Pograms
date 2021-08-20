import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.println("Enter the power value N: ");
        Scanner sc = new Scanner(System.in);
        int powerValue = sc.nextInt();
        Power(powerValue);
    }

    public static void Power(int exp) {
        int base = 2, result = 1;
        if(exp >= 0)
            System.out.println("2 ^ 0 = 1");
        if (exp>0 && exp < 31 ) {
            for (int i =1; exp >= i; i++) {
                result  = result * 2;
                System.out.println("2 ^ " +i+ " = "+result);
            }
        }
        else
            System.out.println("Wrong value! power of N value can't exeed 31");
    }
}
