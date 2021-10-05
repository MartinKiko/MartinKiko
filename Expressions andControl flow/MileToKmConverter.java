import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write distance in miles: ");
        double distanceInMiles = sc.nextDouble();
        System.out.println(distanceInMiles * 1.609 + " kilometers");
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}
