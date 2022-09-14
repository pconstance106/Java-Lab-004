import java.util.Scanner;
public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.

    public static void main(String[] args) {
        double base, exponent;
        double power;
        Scanner number = new Scanner(System.in);
        System.out.println("Base number");
        base = number.nextInt();
        System.out.println("Exponent value");
        exponent = number.nextInt();
        System.out.print(Math.pow(base, exponent));
    }
}
