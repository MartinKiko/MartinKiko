import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Guess my number: ");

        int number = 8;
        boolean win = true;
        while (win){
            int userInput1 = num.nextInt();
            if (userInput1 < number){
                System.out.print("The stored number is higher. Guess again: ");
            }
            else if(userInput1 > number){
                System.out.print("The stored number is lower. Guess again: ");
            }
            else{
                win = false;
            }
        }
        System.out.println("You found the number: 8");
    }
}
// Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8