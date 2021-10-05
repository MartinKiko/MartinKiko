import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        /*
        1. Create a map where the keys are strings and the values ------------------------ OK
            are strings with the following initial values

            Key	                Value
            978-1-60309-452-8	A Letter to Jo
            978-1-60309-459-7	Lupus
            978-1-60309-444-3	Red Panda and Moon Bear
            978-1-60309-461-0	The Lab

        2. Print all the key-value pairs in the following format ------------------------- OK

        A Letter to Jo (ISBN: 978-1-60309-452-8)
        Lupus (ISBN: 978-1-60309-459-7)
        Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        The Lab (ISBN: 978-1-60309-461-0)

        3. Remove the key-value pair with key 978-1-60309-444-3 -------------------------- OK
        4. Remove the key-value pair with value The Lab ---------------------------------- OK
        5. Add the following key-value pairs to the map ---------------------------------- OK

            Key                 Value
            978-1-60309-450-4	They Called Us Enemy
            978-1-60309-453-5	Why Did We Trust Him?

        6. Print whether there is an associated value with key 478-0-61159-424-8 or not -- OK
        7. Print the value associated with key 978-1-60309-453-5 ------------------------- OK
        */
//-----------------------------------------------------------------------------------------------
        //Create a map where the keys are strings and the values
        //are strings with the following initial values
        HashMap<String,String> map = new HashMap<String, String>();
        //      key                 value
        map.put("978-1-60309-452-8","A Letter to Jo");
        map.put("978-1-60309-459-7","Lupus");
        map.put("978-1-60309-444-3","Red Panda and Moon Bear");
        map.put("978-1-60309-461-0","The Lab");

        //Print all the key-value pairs in the following format
        //A Letter to Jo (ISBN: 978-1-60309-452-8) ...
        for (String key : map.keySet()) {
            System.out.println(map.get(key) + " (ISBN: " + key + ")");
        }

        //Remove the key-value pair with key 978-1-60309-444-3
        map.remove("978-1-60309-444-3");

        //Remove the key-value pair with value The Lab
        map.remove("978-1-60309-461-0","The Lab");

        //Add the following key-value pairs to the map
        //Key               Value
        //978-1-60309-450-4	They Called Us Enemy
        //978-1-60309-453-5	Why Did We Trust Him?
        map.put("978-1-60309-450-4","They Called Us Enemy");
        map.put("978-1-60309-453-5","Why Did We Trust Him?");

        //Print whether there is an associated value with key 478-0-61159-424-8 or not
        if (map.get("478-0-61159-424-8") == null) {
            System.out.println("With key 478-0-61159-424-8 is not associated any value");
        }   else {
            System.out.println("With key 478-0-61159-424-8 is associated value: ");
        }

        //Print the value associated with key 978-1-60309-453-5
        System.out.println(map.get("978-1-60309-453-5"));

    }
}
        //Notes:
        /*
        System.out.println("values: ");
        for (String key: map.keySet())
            System.out.println(map.get(key));
        System.out.println("keys: ");
        for (String key: map.keySet())
            System.out.println(key);
         */