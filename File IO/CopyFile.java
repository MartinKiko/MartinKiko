import java.io.IOException;
import java.nio.file.*;

public class CopyFile {

    public static void main(String[] args) {

        // Write a function that copies the contents of a file into another file
        // It should take two filenames (string) as parameters:
        //  - path and name of the source file
        //  - path and name of the target file
        // It should return a boolean that shows if the copy was successful

        System.out.println("I've tried to copy the file. Was it successful?\n" + copyFile("my-file.txt", "my-file-copy.txt"));

    }

    public static boolean copyFile(String filename1, String filename2) {

        boolean test;
        Path fileToCopy = Paths.get(filename1);
        Path destinationFile = Paths.get(filename2);
        try {
            Files.copy(fileToCopy, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            test = true;

        } catch (IOException e) {
            test = false;
        }

        return test;

    }

}