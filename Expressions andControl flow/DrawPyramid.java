import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number ; i++)
        {

            for (int j = i; j < number; j++)
            System.out.print(" ");
            for (int k = 1; k < (i * 2) ; k++)
                System.out.print("*");
            System.out.print("\n");

            }

        }
    }


// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was