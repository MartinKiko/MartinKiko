public class Doubling {
    public static void main(String[] args) {

        // - Create an integer variable named `baseNumber` and assign the value `123` to it
        // - Create a function called `doubleNumber()` that doubles its integer input parameter
        //   and returns the doubled value
        // - Print the result of `doubleNumber(baseNumber)`

        int baseNumber = 123;
        int doubleNumber = 10;
        System.out.println(doubles(baseNumber));
        System.out.println(doubles(doubleNumber));

    }

        public static int doubles(int number) {
        number*=2;
        return number;
    }

}


