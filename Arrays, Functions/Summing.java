import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number, that I will summarize: ");
        int num = scanner.nextInt();
        System.out.println("The summary of these numbers is: " + sum(num));

    }
    public static int sum(int number) {
        int all = 0;
        for (int i = 0; i <= number; i++) {
            all += i;
        }
        return all;
    }
}
// Create the usual class wrapper and main method on your own
// Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
