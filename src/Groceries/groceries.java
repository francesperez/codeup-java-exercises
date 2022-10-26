package Groceries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class groceries {
    public static void main(String[] args) {


    {
        ArrayList<HashMap<String, Integer>> myList = new ArrayList<>();


        HashMap<String, Integer> dairy = new HashMap<String, Integer>();
        dairy.put("milk",1);
        dairy.put("cheese",2);
        dairy.put("creamer",1);
        dairy.put("ice cream",4);

        HashMap<String, Integer> veggies = new HashMap<String, Integer>();
        veggies.put("tomatillo",20);
        veggies.put("jalapenos",6);
        veggies.put("potatoes",10);
        veggies.put("onion",3);

        myList.add(dairy);
        myList.add(veggies);

        for (HashMap<String, Integer> stringIntegerHashMap : myList) {
            HashMap<String, Integer> tmpData = (HashMap<String, Integer>) stringIntegerHashMap;
            Set<String> key = tmpData.keySet();
            Iterator<String> it = key.iterator();
            while (it.hasNext()) {
                String hmKey = (String) it.next();
                Integer hmData = (Integer) tmpData.get(hmKey);
                System.out.println("Item: " + hmKey + " Quantity: " + hmData);
                it.remove(); // avoids a ConcurrentModificationException
            }
        }
    }
}



}
