public class Strings {

    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {

        System.out.println(stringChanger("xena"));

    }

    public static String stringChanger (String y) {

        y = y.replace("x","y");

        return y;

    }

}