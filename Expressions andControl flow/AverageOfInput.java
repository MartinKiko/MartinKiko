import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner sc = new Scanner(System.in);
        System.out.print("Write number: ");
        int a = sc.nextInt();

        System.out.print("Write number: ");
        int b = sc.nextInt();

        System.out.print("Write number: ");
        int c = sc.nextInt();

        System.out.print("Write number: ");
        int d = sc.nextInt();

        System.out.print("Write number: ");
        int e = sc.nextInt();

        System.out.println("Sum: " + (a + b + c + d + e) +  " Average: " + (a + b + c + d + e) / 5.);
    }
}
