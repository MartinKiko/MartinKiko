import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write number: ");
        double num = sc.nextDouble();
        if (num <= 0) {
            System.out.println("Not enough");
        }
        if (num == 1) {
            System.out.println("One");
        }
        if (num == 2) {
            System.out.println("Two");
        }
        if (num >= 2) {
            System.out.println("A lot");
        }
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
    }
}


