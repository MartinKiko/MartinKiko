package fibonacci;

        /*
            Write a function that computes a member of the fibonacci sequence by a given index
            Create tests for multiple test cases.
         */

public class Fibonacci {

    private int position;

    Fibonacci(int position) {
        this.position = position;
        if (position < 0) {
            throw new IllegalArgumentException("Negative position");
        }
    }

    public int getResult() {
        Fibonacci fibonacci1 = new Fibonacci(position - 2);
        Fibonacci fibonacci12 = new Fibonacci(position - 1);
        if (position == 0 || position == 1) {
            if (position == 1) {
                return 1;
            } else
                return 0;
        } else {
            return fibonacci1.getResult() + fibonacci12.getResult();
        }
    }
}
