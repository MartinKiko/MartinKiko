import java.util.*;
public class StudentCounter {
    public static void main(String... args) {

        ArrayList<Map<String, Object>> listOfMaps = new ArrayList<Map<String, Object>>();

        // Given this list of hash maps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Theodor");
        row0.put("age", 9);
        row0.put("candies", 2);
        listOfMaps.add(row0);

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        listOfMaps.add(row1);

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        listOfMaps.add(row2);

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        listOfMaps.add(row3);

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        listOfMaps.add(row4);

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        listOfMaps.add(row5);

        // Display the following things:
        //  1. - The names of students who have more than 4 candies
        //  2. - The sum of the age of people who have less than 5 candies

        //  1. - The names of students who have more than 4 candies
        System.out.println("Names of students who have more than 4 candies: ");
        for (int i = 0; i < listOfMaps.size(); i++) {
            if ((int) listOfMaps.get(i).get("candies") > 4) {

                System.out.println(listOfMaps.get(i).get("name"));

            }
        }

        //  2. - The sum of the age of people who have less than 5 candies
        int lessThen5 = 0;
        for (int i = 0; i < listOfMaps.size(); i++) {
            if ((int) listOfMaps.get(i).get("candies") < 5) {
                lessThen5 += (int) listOfMaps.get(i).get("age");
            }
        }

        System.out.println("\n" + "Sum of the age of people who have less than 5 candies: " + lessThen5);

    }

}