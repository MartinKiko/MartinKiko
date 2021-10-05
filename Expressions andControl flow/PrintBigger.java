import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        int a = sc.nextInt();

        System.out.print("Write a number: ");
        int b = sc.nextInt();

        if (a < b)   {
            System.out.println(b);
        }   else {
            System.out.println(a);
        }
    }
}
