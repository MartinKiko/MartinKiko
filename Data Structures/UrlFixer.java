public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String html = ".html";

       url = url.replace("bots", "odds");

       //url = url.concat(html);

       //url = new StringBuffer(url).insert(5, ":").toString();

       url = new StringBuilder(url).insert(5, ":").toString();

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!
        //https://www.reddit.com/r/nevertellmetheodds/
        System.out.println(url);

    }
}
