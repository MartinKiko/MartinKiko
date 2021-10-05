import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {

        /*
        Write a program which first chooses a number between 1 and 100.
        The player is then asked to enter a guess. If the player guesses
        wrong the program gives feedback and asks for new guesses until one is correct.
        Make the range customizable (ask for it before starting the guessing).
        You can add lives. (optional)

            Example
            I've the number between 1-100. You have 5 lives.
            > 20
            Too high. You have 4 lives left.
            > 10
            Too low. You have 3 lives left.
            > 15
            Congratulations. You won!
        */

        guessTheNumber();
    }

    private static void guessTheNumber(){
        System.out.print("I've the number between 1-100. You have 5 lives.\nPlease guess the number:\n> ");
        int numberToGuess = (int)(Math.random()*100)+1;
        Scanner input = new Scanner(System.in);
        int lives = 5;
        boolean condition = true;
        while (condition && lives>0){

            int guess = input.nextInt();

            if (guess == numberToGuess) {
                System.out.println("Congratulations. You won!");
                condition = false;
            }

            else if(guess > numberToGuess) {

                System.out.print( "Too high. You have " + lives + " lives left.\n> ");
                lives--;
            }

            else{

                System.out.print( "Too low. You have " + lives + " lives left.\n> ");
                lives--;

            }

        }

        if (condition && lives == 0){

            System.out.println("\nGame over! No more lives left. The number was: " + numberToGuess);

        }

    }

}