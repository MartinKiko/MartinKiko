public class Colors {

    public static void main(String[] args) {

        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"}, // 0 - 0,1,2,3,4
                {"orange red", "red", "tomato"},                                 // 1 - 0,1,2
                {"orchid", "violet", "pink", "hot pink"}                         // 2 - 0,1,2,3
            };
        System.out.println(colors[0][0]);
    }

}
// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`