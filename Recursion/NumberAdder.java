public class NumberAdder {
        // Write a recursive function that takes one parameter: n and
        // adds numbers from 1 to n.

                    public static void main(String[] args) {
                        int n = 6;
                        System.out.println(factorialLoop(n));
                    }
                        public static int factorialLoop(int fac) {
                            int factorial = 1;
                            for (int i = 1; i  < fac + 1; i++) {
                                factorial *= i;
                            }
                            return factorial;
                        }
                }