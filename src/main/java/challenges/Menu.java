package challenges;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

//in order to create a dynamic menu the data collection we need to focus on is hash maps (key and value pair)
public class Menu() {
    private String banner;
    private int options;

    //created a Menu constructor with the banner and options (just like in the sample python code)
    public Menu(String banner, int options) {
        this.banner = banner;
        this.options = options;
    }

    //need to getters in order to retrieve the banners and options that the user chooses
    public String getBanner() {
        return this.banner;
    }

    public int getOptions () {
        return this.options;
    }

    //need to create the hashmap
    public static void main(String[] args) {
        //created the HashMap object called Menu
        Map<Integer, Menu> menu = new HashMap<>();
        //in order to add key,value pairs into the HashMap need to have the put() method
        //add the java files that I want to run on menu
        menu.put(1, new Menu("ChallengeFRQ2", (IntByReference.main(null))));
        menu.put(2, new Menu("ChallengeFRQ3", (Matrix.main(null))));

        //once entered within the Menu we need to print the Menu out using a for loop
        //going through each of the HashMap's elements and traversing through them
        for (Map.Entry mapelement : menu.entrySet()) {
            //getting the key for each element within the HashMap
            int key = (int)mapelement.getKey;

            //now going to print the keys and values for each element within the HashMap
            System.out.println(key + "=" + mapelement.getValue()getBanner());

        }

    }

    //user input needs to go somewhere still not sure
    Scanner sc = new Scanner(System.in);




}
