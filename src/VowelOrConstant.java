import java.util.Scanner;

public class VowelOrConstant {
    public static void main(String[] args) {

        System.out.println("Enter a character : ");
        Scanner sc = new Scanner(System.in);

        //There is no nextChar(), so we use next().charAt(0).
        //next() function returns the next word in the input as a string.
        //charAt(0) function returns the first character in that string.
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
