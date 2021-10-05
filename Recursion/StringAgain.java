public class StringAgain {

    // Given a string,
    // compute recursively a new string where
    // all the 'x' chars have been removed.

    public static void main(String[] args) {

        System.out.println(stringRemover("xena and xanax"));

    }

    public static String stringRemover (String x) {

        x = x.replace("x", "");

        return x;

    }

}
