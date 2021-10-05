import java.util.Arrays;

public class PersonalFinance {
    public static void main(String[] args){
        /*
        We are going to represent our expenses in a list containing integers.
        1. Create a list with the following items. ------------------------------- OK
           500, 1000, 1250, 175, 800 and 120

        Create an application which solves the following problems.
        2. How much did we spend? ------------------------------------------------ OK
        3. Which was our greatest expense? --------------------------------------- OK
        4. Which was our cheapest spending? -------------------------------------- OK
        5. What was the average amount of our spendings? ------------------------- OK
        */

        int[] expenses = {500, 1000, 1250, 175, 800, 120};

        int sum = 0;
        for(int i=0; i < expenses.length ; i++)
            sum = sum + expenses[i];

        //How much did we spend?
        System.out.println("We spend: " + sum);

        //Which was our greatest expense?
        int max = Arrays.stream(expenses).max().getAsInt();
        System.out.println("Our greatest expense: " + max);

        //Which was our cheapest spending?
        int min = Arrays.stream(expenses).min().getAsInt();
        System.out.println("Our cheapest spending: " + min);

        //What was the average amount of our spendings?
        int average = sum / expenses.length;
        System.out.println("Average amount of our spendings: " + average);
    }
}

