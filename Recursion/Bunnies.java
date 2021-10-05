import java.util.Scanner;

public class Bunnies {
    public static void main(String[] args) {

        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears
        // across all the bunnies recursively (without loops or multiplication).

        Scanner sc = new Scanner(System.in);
        System.out.print("Write number of bunnies: ");
        int bunnies = sc.nextInt();

        System.out.println(bunnyEars(bunnies));

    }
    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {

            return 0;

        } else {

            return 2 + bunnyEars(bunnies - 1);

        }
    }
}
