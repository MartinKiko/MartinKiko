import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        /*
        1. Represent the following products with their prices --------- OK
            Product	Price
            Milk	        1.07
            Rice	        1.59
            Eggs	        3.14
            Cheese	        12.60
            Chicken Breasts	9.40
            Apples	        2.31
            Tomato	        2.58
            Potato	        1.75
            Onion	        1.10

        2. Represent Bob's shopping list ------------------------------ OK
            Product	Amount
            Milk	        3
            Rice	        2
            Eggs	        2
            Cheese	        1
            Chicken Breasts	4
            Apples	        1
            Tomato	        2
            Potato	        1

        3. Represent Alice's shopping list ---------------------------- OK
            Product	Amount
            Rice	        1
            Eggs	        5
            Chicken Breasts	2
            Apples	        1
            Tomato	        10

        Create an application which solves the following problems.
        4. How much does Bob pay? -------------------------------------- OK
        5. How much does Alice pay? ------------------------------------ OK
        6. Who buys more Rice? ----------------------------------------- OK
        7. Who buys more Potato? --------------------------------------- OK
        8. Who buys more different products? --------------------------- OK
        9. Who buys more products? (piece) ----------------------------- OK
         */

        //1. Represent the following products with their prices
        double Milk = 1.07;
        double Rice = 1.59;
        double Eggs = 3.14;
        double Cheese = 12.60;
        double ChickenBreasts = 9.40;
        double Apples = 2.31;
        double Tomato = 2.58;
        double Potato = 1.75;
        double Onion = 1.10;

        //2. Represent Bob's shopping list
        HashMap<Double,Integer> bobsList = new HashMap<Double,Integer>();
        bobsList.put(Milk,3);
        bobsList.put(Rice,2);
        bobsList.put(Eggs,2);
        bobsList.put(Cheese,1);
        bobsList.put(ChickenBreasts,4);
        bobsList.put(Apples,1);
        bobsList.put(Tomato,2);
        bobsList.put(Potato,1);

        //3. Represent Alice's shopping list
        HashMap<Double,Integer> aliceList = new HashMap<Double,Integer>();
        aliceList.put(Rice,1);
        aliceList.put(Eggs,5);
        aliceList.put(ChickenBreasts,2);
        aliceList.put(Apples,1);
        aliceList.put(Tomato,10);

        //4. How much does Bob pay?
            double sum = 0;
        for (Double key: bobsList.keySet())
                sum =  sum + (bobsList.get(key) * key);
        System.out.println("4. Bob pay - " + sum);

        //5. How much does Alice pay?
            double sum1 = 0;
        for (Double key: aliceList.keySet())
            sum1 = (sum1 + (aliceList.get(key) * key));
        System.out.println("5. Alice pay - " + sum1);

        //6. Who buys more Rice?
        if (bobsList.get(Rice) > aliceList.get(Rice)) {
            System.out.println("6. Bob buys more rice - " + bobsList.get(Rice));
        } else {
            System.out.println("6. Alice buys more rice - " + aliceList.get(Rice));
        }

        //7. Who buys more Potato?
        if (bobsList.get(Potato) == null && aliceList.get(Potato) == null) {
            System.out.println("7. No one buys potato");
        } else if (bobsList.get(Potato) == null && aliceList.get(Potato) != null) {
            System.out.println("7. Alice buys more potato - " + aliceList.get(Potato));
        } else if (bobsList.get(Potato) != null && aliceList.get(Potato) == null) {
            System.out.println("7. Bob buys more potato - " + bobsList.get(Potato));
        } else if (bobsList.get(Potato) > aliceList.get(Potato)) {
            System.out.println("7. Bob buys more potato - " + bobsList.get(Potato));
        } else if (bobsList.get(Potato) < aliceList.get(Potato)) {
            System.out.println("7. Alice buys more potato - " + aliceList.get(Potato));
        } else if (bobsList.get(Potato) == aliceList.get(Potato)) {
            System.out.println("7. Alice and Bob buys same number of Potato - " + bobsList.get(Potato));
        }

        //8. Who buys more different products?
        if (bobsList.size() > aliceList.size() ) {
            System.out.println("8. Bob buys more different products - " + bobsList.size());
        } else {
            System.out.println("8. Alice buys more different products - " + aliceList.size());
        }

        //9. Who buys more products? (piece)
        int sa = 0;
        for (Double key: aliceList.keySet())
            sa = sa + aliceList.get(key);

        int sb = 0;
        for (Double key: bobsList.keySet())
            sb = sb + bobsList.get(key);

        if (sb > sa) {
            System.out.println("9. Bob buys more products - " + sb);
        } else {
            System.out.println("9. Alice buys more products - " + sa);
        }

    }
}
