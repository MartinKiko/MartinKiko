public class Swap_elements {

    public static void main(String[] args) {

        String[] orders = {"first", "second", "third"};

        for (int i = orders.length - 1; i >= 0; i--) {
            System.out.println(orders[i]);
        }

    }

}
// - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`