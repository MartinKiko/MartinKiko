import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a: ");
        double a = sc.nextDouble();

        System.out.print("Write b: ");
        double b = sc.nextDouble();

        System.out.print("Write c: ");
        double c = sc.nextDouble();

        System.out.println("Surface Area: " + 2 * (a * b + b * c + a * c));
        System.out.println("Volume: " + a * b * c);


    }
}
