import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteSingleLine {

    public static void main(String[] args) {

        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        Path filePath = Paths.get("my-file.txt");
        ArrayList<String> name = new ArrayList<>(Arrays.asList(("Martin")));

        try {
            Files.write(filePath,name);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

}