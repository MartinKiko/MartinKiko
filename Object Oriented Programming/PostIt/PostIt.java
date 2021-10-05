package PostIt;

        /*
        Create a PostIt class that has
        a backgroundColor represented by a string
        a text on it
        a textColor represented by a string
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!"
        */

    public class PostIt {
        String backGroundColor;
        String textColor;
        String text;

        public PostIt(String backGroundColor, String textColor, String text) {
            this.backGroundColor = backGroundColor;
            this.textColor = textColor;
            this.text = text;
        }
    }