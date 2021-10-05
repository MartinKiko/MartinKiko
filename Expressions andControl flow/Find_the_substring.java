public class Find_the_substring {
    public static void main(String[] args) {

        String str1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        String str2 = "amet";

        System.out.println(str1.lastIndexOf(str2));
    }
}
// Create a function that takes two strings as a parameter
// Returns the starting index where
// the second one is starting in the first one
// Returns `-1` if the second string is not in the first one