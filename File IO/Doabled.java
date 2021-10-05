import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

        // Create a method that decrypts the duplicated-chars.txt.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.

public class Doabled {
    public static void main(String[] args) {
        try {
            File myObj = new File("duplicated-chars.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                final String str = data;
                String replaced = str.replaceAll("(.)\\1", "$1");
                System.out.println(replaced);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
