package countletters;

        /*
            Write a function, that takes a string as an argument and returns
            a dictionary with all letters in the string as keys, and numbers as
            values that shows how many occurrences there are.
            Create a test for that.
         */

import java.util.HashMap;

public class CountLetters {

    private String letter;
    private HashMap<String, Integer> dictionary = new HashMap<>();

    public CountLetters(String letter) {
        this.letter = letter;
    }

    public HashMap<String, Integer> getDictionary() {
        if (letter == null) {
                throw new IllegalArgumentException("No words entered");
        }

        if (letter.equals("")) {
            throw new IllegalArgumentException("No words entered");
        }

        char[] letterByWordletterChar = letter.toLowerCase().toCharArray();
        String[] letterByWordLetter = new String[letterByWordletterChar.length];
        for (int i = 0; i < letterByWordLetter.length; i++) {
            letterByWordLetter[i] = String.valueOf(letterByWordletterChar[i]);
        }

        for (int i = 0; i < letterByWordLetter.length; i++) {
            if (dictionary.containsKey(letterByWordLetter[i]) == false) {
                dictionary.put(letterByWordLetter[i], 1);
            } else {
                dictionary.put(letterByWordLetter[i], dictionary.get(letterByWordLetter[i]) + 1);
            }
        }
        return dictionary;
    }

}
