import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));


        Person person1 = new Person("Jane Doe");
        Person person2 = new Person("John Smith");
        Person person3 = new Person("Leroy Jenkins");

        Person[] person = {person1, person2, person3};
        for(Person Person : person){
            System.out.println((Person));
        }


    }







}
