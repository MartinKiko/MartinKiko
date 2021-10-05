import java.util.Scanner;
public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads parameters from the prompt
        // and prints the result back to the prompt
        // It should support one of the following operators: +, -, *, /, %
        // and two operands
        // The format of the input expressions must be: {operator} {operand} {operand}
        // Input examples:
        //    "+ 3 3" (the result will be 6)
        //    "* 4 4" (the result will be 16)

        // To make it work create a method named "calculate()" and use the Scanner class
        // to get input from the user

        // The process should work like this:
        // - Start the program
        // - Print: "Please type in the expression:"
        //   (Wait for the user input)
        // - After receiving the input print the result number to the prompt
        // - Exit the program

        String plus = "+";
        String minus = "-";
        String multi = "*";
        String divi = "/";
        String perc = "%";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in the expression: (Example: \"+ 3 3\"): ");
        String calcu = scanner.nextLine();
        String[] alone = calcu.split(" ");
        int one = Integer.parseInt(alone[1]);
        int two = Integer.parseInt(alone[2]);
        double doubleone = Double.parseDouble(alone[1]);
        double doubletwo = Double.parseDouble(alone[2]);

        int result = 0;

        double result2 = 0;

        if (alone[0].equals(plus)) {

            result = one + two;

        } else if (alone[0].equals(minus)) {

            result = one - two;

        } else if (alone[0].equals(multi)) {

            result = one * two;

        } else if (alone[0].equals(perc)) {

            result2 = (doubleone / doubletwo) * 100;

        } else if (alone[0].equals(divi)) {

            if (one % two == 0) {

                result = one / two;

            } else {

                result2 = doubleone / doubletwo;

            }

        }

        if (result == 0) {

            System.out.println(result2);

        } else if (result2 == 0) {

            System.out.println(result);

        }

    }

}