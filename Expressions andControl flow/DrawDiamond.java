import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        int num = sc.nextInt();

        if (num % 2 == 1) {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i < num / 2 + 0.5 && j >= (num - 1) / 2 - i && j <= (num - 1) / 2 + i) {
                        System.out.print("*");
                    } else if (i >= num / 2 + 0.5 && j > (num - 1) / 2 - (num - i) && j < (num) / 2 + (num - i))
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    if (i < num / 2 && j >= num / 2 - i && j <= num / 2 + i) {
                        System.out.print("*");
                    } else if (i >= num / 2 && j >= num / 2 + 0.5 - (num - i) && j <= (num) / 2 - 0.5 + (num - i))
                        System.out.print("*");
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }

    }
}
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was