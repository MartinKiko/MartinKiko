public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        //System.out.println(quote.charAt(19));

        quote = new StringBuilder(quote).insert(21, "always takes longer than ").toString();

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the
        // StringBuilder class!
        // Use pieces of the quote variable (instead of just redefining the string)!

        //StringBuilder newString = new StringBuilder(quote);
        //newString.insert(quote.indexOf("you"), "always takes longer than ");
        //System.out.println(newString);

        System.out.println(quote);
    }
}
