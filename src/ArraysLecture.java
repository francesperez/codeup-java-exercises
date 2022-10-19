import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysLecture {
    //The size of a java array is determined when it is created and cannot be modified. There are rare situations
    // where this is useful; like when you have a fixed quantity of things that you want to store.
    public static void main(String[] args) {
        int[] numbers; //here we have an array of integers
        numbers = new int[5];
        numbers [0] = 78;
        numbers [1] = 253;
        numbers [2] = 4234;
        numbers [3] = -231;
        numbers [4] = 463;
        System.out.println(numbers[0]);
        Arrays.sort(numbers); //it does mutate the array so we dont have to store the return somewhere.
//        System.out.println(numbers[0]);
//        System.out.println(Arrays.toString(numbers));

        String[] wordsforWeird = {"strange", "bizzare", "uncanny", "odd", "peculiar", "weird"};
//        System.out.println(wordsforWeird[2]);

//        for(String wordForWeird : wordsforWeird){
//            System.out.println(wordForWeird);
//        }
//
//        for (int number : numbers){
//            System.out.println(number);
//        }

        //This prints out each element in the array in its own line
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("The number at index %d is %d%n", i, numbers[i]);
        }



    }
}
