package anagram;

        /*
            Write a function, that takes two strings and returns a boolean value
            based on if the two strings are Anagramms or not.
            Create a test for that.
         */

public class Anagram {
    private String word;
    private String wordAnagram;

    public Anagram(String word, String wordAnagram) {

        if (word == null || wordAnagram == null) {

            try {
                throw new IllegalArgumentException("No words entered");
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }

        }
        this.word = word;
        this.wordAnagram = wordAnagram;
    }

    public boolean isAnagram () {
        if (word.length() != wordAnagram.length()) {
            return false;
        }   else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == wordAnagram.charAt(wordAnagram.length() - i - 1)) {
                    return true;
                }
            }
        }
        return false;
    }
    
}