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

public class Main {
    public static void main(String[] args) {
        PostIt postIt1 = new PostIt("orange","blue","Idea 1");
        PostIt postIt2 = new PostIt("pink","black","Awesome");
        PostIt postIt3 = new PostIt("yellow","green","Superb!");
        System.out.println(postIt1.backGroundColor + " " + postIt1.textColor + " " + postIt1.text);
    }
}
