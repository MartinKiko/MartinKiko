public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String which is passed as parameter
        // Pass the toBeReversed variable to this method to check if it works well
        // Solve this task using charAt() function first
        // Try other solutions when you are done

       /*
        System.out.println(toBeReversed.length());
        System.out.println(toBeReversed.charAt(3));
        System.out.println(toBeReversed.indexOf("f"));
        */

        String reverse = "";
        for(int i = toBeReversed.length() - 1; i >= 0; i--)
        {
            reverse = reverse + toBeReversed.charAt(i);
        }
        System.out.println(reverse);


        StringBuilder sb = new StringBuilder();

        for(int i = toBeReversed.length() - 1; i >= 0; i--)
        {
            sb.append(toBeReversed.charAt(i));
        }

        System.out.println(sb.toString());

    }
}