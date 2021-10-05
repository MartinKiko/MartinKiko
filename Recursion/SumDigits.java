public class SumDigits {
    public static void main(String[] args) {

        // Given a non-negative integer n, return the sum of it's digits recursively
        // (without loops).
        //
        // Hint
        //
        // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
        //
        // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

        System.out.println(sumDigit(126));
    }

    public static int sumDigit(int n) {
        if (n == 0 ) {
            return 0;
        } else {
            return (n % 10) + sumDigit(n / 10);
        }
    }
}