import java.util.HashMap;

public class DoableHomework {
    public static void main(String[] args) {
        /*
        Create 5 trees
        Store the data of them in variables in your program
        for every tree the program should store its'
        type
        leaf color
        age
        sex
        you can use just variables, or lists and/or maps
         */

        HashMap<String,String> tree1 = new HashMap<String,String>();
        tree1.put("type","Oak");
        tree1.put("leaf color","Green");
        tree1.put("age","67");
        tree1.put("sex","M");

        HashMap<String,String> tree2 = new HashMap<String,String>();
        tree1.put("type","Acer");
        tree1.put("leaf color","Green");
        tree1.put("age","87");
        tree1.put("sex","F");

        HashMap<String,String> tree3 = new HashMap<String,String>();
        tree1.put("type","Oak");
        tree1.put("leaf color","green");
        tree1.put("age","76");
        tree1.put("sex","M");

        HashMap<String,String> tree4 = new HashMap<String,String>();
        tree1.put("type","Elm");
        tree1.put("leaf color","Green");
        tree1.put("age","65");
        tree1.put("sex","F");

        HashMap<String,String> tree5 = new HashMap<String,String>();
        tree1.put("type","Elm");
        tree1.put("leaf color","Green");
        tree1.put("age","43");
        tree1.put("sex","M");
    }

}
