package CollectionsLecture;

import movies.MoviesArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

//   A collection is a data structure that can be used to group, or collect, objects. The Java standard library, a collection of code that comes with the Java language, contains many collections to help with common programming tasks.

//ArrayList is a class that represents an array that can change its size. All elements in an ArrayList must be objects, and they must have the same type. Recall that arrays in Java have a fixed length; once they are created they cannot change their length. In order to "add" an item to an array, you must make a copy of the array with a length bigger than the original. You can think of an ArrayList as a wrapper around the native Java array that handles the details of resizing the array to add elements for you.

//      reference variable<data type>         referring to reference
        ArrayList<String> movies = new ArrayList<>(); //declaring the array list then referencing the arraylist. New
        // arraylist is where it comes into existence, the arraylist<string> is the reference variable.

//=========HOW TO ADD MOVIES TO THE ARRAY==============
        movies.add("Eternal Sunshine of the Spotless Mind");
        movies.add("Amelie");
        movies.add("Kill Bill");
        movies.add("Legion");
        movies.add("My Brilliant Friend");
        movies.add("Dead Alive");
        System.out.println(movies);

//=========HOW TO FIND THE SIZE OF THE ARRAY===================================================
//        System.out.println(movies.size());


//========HOW TO RETURN THE ELEMENT AT THE SPECIFIED INDEX=====================================
//        System.out.println(movies.get(0));

//========HOW TO RETURN THE FIRST FOUND INDEX OF THE GIVEN ITEM================================
//        System.out.println(movies.indexOf("Legion"));
//
//        movies.set(3, "Me, You, and Everyone We Know");


//=========HOW TO LOOP OVER AN ARRAYLIST=======================================================
//        for(int i=0; i < movies.size(); i++){
//            System.out.println(movies.get(i));
//        }
//        ===ENHANCED FOR LOOP===
//        for (String movie : movies){
//            System.out.println(movie);
//        }

//        movies.remove(4);
//        movies.remove(3);
//        movies.remove(2);
//        for(int i=0; i < movies.size(); i++){
//            System.out.println(movies.get(i));
//        }

//==========HOW TO ADD MULTIPLE THINGS TO AN ARRAY WITHOUT .ADDING A BUNCH OF TIMES============
        String movie1 = new String("Movie1");
        String movie2 = new String ("Movie2");
        String movie3 = new String ("Movie3");
        String movie4 = new String ("Movie4");

//     List is an interface            <ArrayList implements list, it is a style of List(Its List done in Array style)
        List<String> newMovieList = new ArrayList<>(List.of(movie1, movie2, movie3, movie4));
        System.out.println(newMovieList);

//========HOW TO ADD NEW MOVIES TO OLD LIST====================================================
        movies.addAll(new ArrayList<>(List.of(movie1, movie2, movie3, movie4)));
//        movies.addAll(newMovieList);
        System.out.println(movies);


//============HOW TO SORT AN ARRAY LIST========================================================
//        when creating and ArrayList of primitive data types, use the corresponding Object wrapper. In the below
//        case, it would be <Integer>.
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,89,34,-67,213,-43,39,3826,2908,48,23,4,645,88,-55,333));
        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(movies);
        movies.sort(Collections.reverseOrder());
        System.out.println(movies);

//==================HOW TO SORT WITHIN AN OBJECT================================================
//        ***I DON'T HAVE AN OBJECT, BUT I WILL COPY THE CODE FROM THE MONSTERS LECTURE
        //        monsterArrayList.sort(Comparator.comparing(Monster::getHitPoints)));

//        If you want to compare custom objects rather than numbers or strings, a simple method is to call .sort() on
//        the list and pass it
//        Comparator.comparing(NameOfObject::getterForWhatYouWantToCompare)

//        If I want to sort custom objects by properties in reverse order, it's a little more complex. One
//        technique is to implement Comparator in the class and override the compare method.


    }
}
