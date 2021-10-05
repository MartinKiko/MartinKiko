import java.util.HashMap;
import java.util.*;

public class TelephoneBook {
    public static void main(String[] args) {
        /*
        1. Create a map with the following key-value pairs. ------------------ OK
            Name (key)	        Phone number (value)
            William A. Lathan	405-709-1865
            John K. Miller	    402-247-8568
            Hortensia E. Foster	606-481-6467
            Amanda D. Newland	319-243-5613
            Brooke P. Askew	    307-687-2982

        Create an application which solves the following problems.

        2. What is John K. Miller's phone number? ---------------------------- OK
        3. Whose phone number is 307-687-2982? -------------------------------
        4. Do we know Chris E. Myers' phone number? -------------------------- OK
         */
        HashMap<String,String> book = new HashMap<String,String>();
        //      key                 value
        book.put("William A. Lathan","405-709-1865");
        book.put("John K. Miller","402-247-8568");
        book.put("Hortensia E. Foster","606-481-6467");
        book.put("Amanda D. Newland","319-243-5613");
        book.put("Brooke P. Askew","307-687-2982");

        //What is John K. Miller's phone number?
        System.out.println("John K. Miller's phone number is: " + book.get("John K. Miller"));

        //Whose phone number is 307-687-2982?
        for (String key : book.keySet()) {
            System.out.println(book.get(key) + ", " + key);
        }

        //Do we know Chris E. Myers' phone number?
        if (book.get("Chris E. Myer") == null) {
            System.out.println("We don't know Chris E. Myers' phone number");
        }   else {
            System.out.println("Chris E. Myers' phone number is: " + book.get("Chris E. Myer"));
        }
    }


}
