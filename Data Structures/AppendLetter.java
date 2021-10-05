import java.util.*;

public class AppendLetter {

  public static void main(String... args) {

    List<String> animals = Arrays.asList("koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "pirahn");

    // Create a method called "appendA()"" that adds "a" to every string in the "animals" list
      // Its parameter should be a list

    System.out.println(appendA(animals));

  }

  private static String appendA(List<String> animals) {

    String end = "";
    for (int i = 0; i < animals.size(); i++) {
      end += "\"" + animals.get(i) + "a" + "\"" + ", ";
    }

    return end;

  }

}

// The output should be: "koala", "panda", "zebra" ...
