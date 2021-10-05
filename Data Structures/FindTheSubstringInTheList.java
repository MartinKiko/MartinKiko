public class FindTheSubstringInTheList {

    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  and returns the index of the string (in the list) which contains the first string
        //  You only need to find the first occurrence and return the index of that
        //  Return `-1` if none of the items in the list contain the first string

        //  Example
        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching"};
        System.out.println(findIndex("ching", searchArr));
        //  should print: `4`

        System.out.println(findIndex("not", searchArr));
        //  should print: `-1`
    }
    public static int findIndex(String input, String[] listOfStrings){
        int indexOfFirtsOccurance = -1;

        for (int i = 0; i <listOfStrings.length ; i++) {

            if (listOfStrings[i].contains(input)){
                indexOfFirtsOccurance=i;
                break;

            }

        }

        return indexOfFirtsOccurance;
    }

}
