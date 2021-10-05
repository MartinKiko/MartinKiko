//import java.util.ArrayList;
import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        //Create an empty map where the keys are integers and the values are characters - OK
        //Print out whether the map is empty or not ------------------------------------- OK
        //Add the following key-value pairs to the map ---------------------------------- OK
        //Print all the keys ------------------------------------------------------------ OK
        //Print all the values ---------------------------------------------------------- OK
        //Add value D with the key 68 --------------------------------------------------- OK
        //Print how many key-value pairs are in the map --------------------------------- OK
        //Print the value that is associated with key 99 -------------------------------- OK
        //Remove the key-value pair where with key 97 ----------------------------------- OK
        //Print whether there is an associated value with key 100 or not ---------------- OK
        //Remove all the key-value pairs ------------------------------------------------ OK
        /*
        Key	Value
        97	a
        98	b
        99	c
        65	A
        66	B
        67	C
        */

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        map.put(97,"a");
        map.put(98,"b");
        map.put(99,"c");
        map.put(65,"A");
        map.put(66,"B");
        map.put(67,"C");
        map.put(68,"D");

        if (map.size() == 0) {
            System.out.println("Map is empty");
        }   else {
            System.out.println("Map is not empty");
        }

        String returned_value = (String)map.remove(97);

        //Remove all the key-value pairs
        /*
        hm.remove(98,"a"); // ?
        hm.remove(99);
        hm.remove(65);
        hm.remove(66);
        hm.remove(67);
        hm.remove(68);
        */

        System.out.println("keys: ");
        for (Integer key: map.keySet())
            System.out.println(key);

        System.out.println("values: ");
        for (Integer key: map.keySet())
            System.out.println(map.get(key));

        System.out.println("Pairs in the map: " + map.size());

        System.out.println(map.get(99));

        if (map.get(100) == null) {
            System.out.println("Not associated value with key 100");
        }   else {
            System.out.println("Associated value with key 100 is: " + map.get(100));
        }
    }
}
