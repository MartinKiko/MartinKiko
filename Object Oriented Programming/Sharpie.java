    /*
    1. Create a Sharpie class
        We should know the followings about each sharpie:
    2. color (which should be a string),
    3. width (which will be a floating point number)
    4. and the inkAmount (another floating point number)
    We need to specify the color and the width at creation
    5. Every sharpie is created with a default inkAmount value: 100
    6. We can use() the sharpie objects: using it decreases inkAmount by 10
    */
    public class Sharpie {
        String color;
        double width;
        double inkAmount;

        public Sharpie() {
            color = "yellow";
            width = 2.1;
            inkAmount = 100;
        }

        public void use() {
            this.inkAmount -= 10;
        }

        public static void main(String[] args) {
            Sharpie sharpie1 = new Sharpie();
            sharpie1.use();
            System.out.println("Sharpie color: " + sharpie1.color + "\nSharpie widh: " + sharpie1.width + "\nSharpie inkamount: " + sharpie1.inkAmount);
        }
    }
