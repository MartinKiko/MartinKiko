import java.util.HashMap;
import java.util.Collections;

public class ProductDatabase {
    public static void main(String[] args) {
        /*
        We are going to represent our products in a map where the keys are strings representing
        the product's name and the values are numbers representing the product's price.

        1. Create a map with the following key-value pairs. ---------------------------------- OK
            Product name (key)	Price (value)
            Eggs	200
            Milk	200
            Fish	400
            Apples	150
            Bread	50
            Chicken	550

        Create an application which solves the following problems.
        2. How much is the fish? -------------------------------------------------------------- OK
        3. What is the most expensive product? ------------------------------------------------ OK
        4. What is the average price? --------------------------------------------------------- OK
        5. How many products' price is below 300? --------------------------------------------- OK
        6. Is there anything we can buy for exactly 125? -------------------------------------- OK
        7. What is the cheapest product? ------------------------------------------------------ OK
        */

        // 1. Create a map with the following key-value pairs.
        HashMap<String,Integer> products = new HashMap<String,Integer>();
        products.put("Eggs",200);
        products.put("Milk",200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken",550);

        //2. How much is the fish?
        System.out.println("2. Fish price - " + products.get("Fish"));

        //3. What is the most expensive product?
        int maxValueInMap=(Collections.max(products.values()));
        for (String key: products.keySet())
        if (products.get(key) == maxValueInMap) {
            System.out.println("3. The most expensive product is " + key + " - " + products.get(key));
        }

        //4. What is the average price?
        int sum = 0;
        for (String key: products.keySet())
            sum = sum + products.get(key);
            System.out.println("4. Average price is - " + sum / products.size());

        //5. How many products' price is below 300?
        int below = 0;
        for (String key: products.keySet())
            if (products.get(key) <= 300) {
                below++;
            } else {
                below=0;
            }
        System.out.println("5. There are " + below + " products their price is below 300");

        //6. Is there anything we can buy for exactly 125?
        int a = 0;
        for (String key: products.keySet())
            if (products.get(key) == 125) {
               a++;
            } else {
               a =0;
            }
        if (a>0) {
            System.out.println("6. There is something we can buy for exactly 125");
        } else {
            System.out.println("6. There is nothing we can buy for exactly 125");
        }

        //7. What is the cheapest product?
        int minValueInMap=(Collections.min(products.values()));
        for (String key: products.keySet())
            if (products.get(key) == minValueInMap) {
                System.out.println("7. The cheapest product is " + key + " - " + products.get(key));
            }

    }
}
