import java.util.ArrayList;

public class JosephusProblem {

    public static void main(String[] args) {

        /*
        Write a function to solve Josephus Problem.
        The program should ask for a number which represents the number of people playing the "game".
        The return value should be the number of the "winning" seat.

        Examples
        number of   number of
        people	    the winning seat
        1	        1
        2	        1
        3	        3
        7	        7
        12	        9
        41	        19
        */

        System.out.println(josephusProblem(2));
        System.out.println(josephusProblem(12));
        System.out.println(josephusProblem(41));
    }
    public static ArrayList<Integer> josephusProblem(int numberOfSeats){
        ArrayList<Integer> listOfSeats= new ArrayList<>();

        for (int i = 0; i < numberOfSeats ; i++) {
            listOfSeats.add(i,i+1);
        }

        boolean condition = true;

        while(condition) {

            for (int i = 0; i < listOfSeats.size(); i++) {
                if (i == listOfSeats.size() - 1) {
                    listOfSeats.remove(0);
                    break;

                }

                listOfSeats.remove(i + 1);

            }

            if (listOfSeats.size() == 1) {
                condition = false;
            }

        }

        return listOfSeats;

    }

}