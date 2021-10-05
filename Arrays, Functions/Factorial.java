import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a number: ");
        int num = scanner.nextInt();
        System.out.println(calculateFactorial(num));

    }
    public static int calculateFactorial(int fact) {
        int all = 1;
        for (int i = 1; i <= fact; i++) {
            all*=i;
        }
        return all;
    }
}
//  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input