
package ArrayListYoutube;

import java.util.ArrayList;

public class MainTest {
    //    ArrayList is a collection; a type of resizeable array. Elements can be added and removed after compilation phase.
//    They only store reference data types.
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        //We will need to import ArrayList

        //How will we add values to the ArrayList? We need a function for it. It is the add function.
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0, "sushi");
        //.set is used to replace using (index, element). So, here we are replacing the 0
        // index, "pizza" with sushi!

        for(int i=0; i < food.size; i++){
            System.out.println(food.get(i));
        }

        //If we need to store primitive values like int, double, a char; we need to use the wrapper class. For example,
        // instead of using <int> we would need to use <Integer>.

    }
}