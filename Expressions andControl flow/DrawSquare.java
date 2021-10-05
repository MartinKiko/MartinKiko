import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write number: ");
        int num = sc.nextInt();

        for (int a = 1; a <= 5; a++) {
            System.out.print("%");
        }
        System.out.println();
        for (int b = 1; b <= num -2; b++) {
            System.out.println("%   %");
        }
        for (int c = 1; c <= 5; c++) {
            System.out.print("%");
        }
        System.out.println();
    }
}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
