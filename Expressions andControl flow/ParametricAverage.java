import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Write a number: ");
        int input1 = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < input1; i++){
            if (i == input1 - 1){
                System.out.print("Give me one more number: ");
            }
            else {
                System.out.print("Give me " + (input1 - i) + " numbers: ");
            }
            int userInput2 = sc.nextInt();
            sum = sum + userInput2;
        }

        int average = sum/input1;

        System.out.print("Sum: " + sum + ", Average: " + average);

    }
}
// Write a program that asks for a number
// It would ask this many times to enter an integer
// If all the integers are entered it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4