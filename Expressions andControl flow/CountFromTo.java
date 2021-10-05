import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Write second number: ");
        int secondNumber = sc.nextInt();
        if (firstNumber >= secondNumber) {
            System.out.println("The second number should be bigger");
        }   else {

            int num = secondNumber - firstNumber;

            for (int i = 0; i < num; i++) {

                System.out.println(firstNumber + i);
            }
        }
    }
}
// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5