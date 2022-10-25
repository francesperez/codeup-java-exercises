package CollectionsLecture;

import com.sun.source.tree.CompilationUnitTree;

import java.util.*;

import static java.util.Map.entry;

public class HashMapLecture {
//    A hash map is a data structure for key-value pairs, implemented with the HashMap class in Java. These are similar to objects in JavaScript. All the keys in the hash map must be of the same type, and all the values must be of the same type, but the keys and the values don't necessarily have to be the same type.

//    The essence of a hashmap is it is a data structure in which some sort of value is stored in a place called a
//    bucket and is referenced by a key which is typically, but not always, a String. So you have a string, and an
//    object.

    public static <Strings> void main(String[] args) {
//==========================HOW TO CREATE A HASHMAP================================
//Create a new HashMap defining the key and value data types between angle brackets
            HashMap<String, String> countries = new HashMap<>();

//Add a key-value pair to the HashMap using .put()
            countries.put("USA", "Washington D.C");
            countries.put("Peru", "Lima");
            countries.put("China", "Beijing");
            countries.put("England", "London");
            System.out.println(countries);

//Access a value in the HashMap using .get() with the key
        System.out.println(countries.get("USA")); //returns value because you put in the key!
        System.out.println(countries.get("Lima")); //will return null because you are putting in the value

//Replace a value in the HashMap using .replace()
        countries.replace("USA", "DC");
        System.out.println(countries);

//To add multiple objects to a HashMap at once, use Map.ofEntries()

//       Map<String, String> secondMap = Map.ofEntries(
//               entry("Shirt", "Striped"),
//               entry("Shoes", "Brown"),
//               entry("Sweater", "Tribal"),
//               entry("Pants", "Jean"),
//               entry("Earrings", "Gold")
//       );
//
//        countries.putAll(secondMap);
//        System.out.println(countries);

//=======================HOW TO LOOP OVER A HASHMAP=========================================
//        **TECHNIQUE ONE** USE .ENTRYSET TO DERIVE A SET OF ENTRIES. ONCE YOU HAVE AN ENTRY SET, YOU CAN USE AN
//        ENHANCED FOR LOOP TO LOOP OVER IT
        for(Map.Entry<String, String> country : countries.entrySet()){
            System.out.printf("%s is the capital of %s.%n", country.getValue(), country.getKey());
        }
//        **TECHNIQUE TWO**


//        **TECHNIQUE THREE** THE FOR EACH LOOP
//        monsterHashMap.forEach((key, monster) -> {
//            System.out.printf("The %s has %d hit points, an armour class of %d, and does %d damage.%n", monster,
//                    monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
//
//        });


//========================HOW TO SORT THE HASHMAP==========================================
//TO CREATE A LIST OF SPECIFIC PROPERTIES IN A THE OBJECTS STORES AS HASHMAP VALUES, WE CAN
//      USE .KEYSET().STREAM().TOLIST()
        List<String> names = new ArrayList<>(countries.keySet().stream().toList());
//        ONCE WE HAVE CONVERTED THE HASHMAP INTO A LIST, WE CAN NOW SORT IT
        Collections.sort(names);
        System.out.println(names);
//        THE STRINGS GENERATED FROM THE KEYSET ARE THE KEYS TO THE HASHMAP, SO LOOPING OVER THIS LIST

//==================CONVERT HASHMAP INTO TREEMAP============================================
        Map<String, String> sortedCountries = new TreeMap<>(countries);
        System.out.println(sortedCountries);


//==========================HOW TO RETURN AN ARRAY FROM HASHMAP=============================
//        Object[] monstersArray = monsterHashMap.values().toArray();
//        for (Object monster : monstersArray){
//            int hitPoints = ((Monster)monster).getHitPoints();
//            System.out.println(hitPoints);
//        }

    }
}
