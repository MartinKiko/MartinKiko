import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write number: ");
        int num = sc.nextInt();

        int i = 0;
        int j = 0;
        while ( j < num) {
            while (i < num) {
                if (j == i){
                    System.out.print("%");
                }

                else if (i == 0 || j == 0){
                    System.out.print("%");
                }

                else if (i == num - 1 || j == num -1){
                    System.out.print("%");
                }

                else{
                    System.out.print(" ");
                }

                i++;
            }

            System.out.println("");
            i = 0;
            j++;
        }
    }
}
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was