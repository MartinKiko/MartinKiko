import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        /*
        1. Create a function that divides number 10 ----------------------------- OK
        2. by a number that's passed as a paramater and prints the result. ------ OK
        3. It should print "fail" if the parameter is 0 ------------------------- OK
        */

            // 1. Create a function that divides number 10
            // 2. by a number that's passed as a paramater and prints the result.
        System.out.print("Enter a divider: ");
        Scanner input = new Scanner(System.in);
        double divider = input.nextInt();
        System.out.println("Result: "+divideTen(divider));
    }

        public static double divideTen (double divider) {
            double result = 0.0;
            try {
                result = 10/divider;
            }

            // 3. It should print "fail" if the parameter is 0
            catch (ArithmeticException e) {
                System.out.println("fail");
            }
            return result;
    }
}