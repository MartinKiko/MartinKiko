import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";
        isAnagram(first,second);


    }

    public static void isAnagram(String first, String second) {
        String[] splitfirst = {""};
        String[] splitsecond = {""};
        String toCheck1 = "";
        String toCheck2 = "";
        splitfirst = first.split("");
        splitsecond = second.split("");
        Arrays.sort(splitfirst);
        Arrays.sort(splitsecond);
        for (String s : splitfirst) {
            toCheck1 += s;
        }
        for (String d : splitsecond) {
            toCheck2 += d;
        }
        if (toCheck1.equals(toCheck2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
/*
Exercise
Create a function named isAnagram() following your current language's style guide.
It should take two strings and return a boolean value depending on whether it's an anagram or not.

Examples
input 1	input 2	output
"dog"	"god"	true
"green"	"fox"	false
 */