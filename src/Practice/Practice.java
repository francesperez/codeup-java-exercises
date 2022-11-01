package Practice;


import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static int subtractTen(int number){
        return number - 10;
    }

    public static double average(int[] numbers){
        double total = 0;
        for(double number : numbers){
            total += number;
        }
        return total/numbers.length;
    }

//12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.

    public static ArrayList<Integer> multiplyAll(int multiplier, ArrayList<Integer> numbers){
        ArrayList<Integer> newNumArrLis = new ArrayList<>();
        for (int number : numbers){
            newNumArrLis.add(number * multiplier);
        }
        return newNumArrLis;
    }

    public static void main(String[] args) {
        System.out.println(subtractTen(8796));
        int[] numbers = {70,80,70,70,704,340,534053,4534};
        System.out.println(average(numbers));
        for (int number : multiplyAll(5, new ArrayList<>(List.of(5,423,423,1,2,2,1,24,234,32,1,123,214,23,4)))){
            System.out.println(number);
        }
    }
}
