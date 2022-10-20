import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
public static Person[] addPerson(String name, Person[] people){
         Person[] addedPerson = new Person[people.length + 1]; //whenever we look at square brackets, we are
    // looking specifically at an array
    for (int i = 0; i < people.length; i++){
        addedPerson[i] = people[i];
    } addedPerson[addedPerson.length -1] = new Person(name);
    return addedPerson;
}

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//
//
//        Person person1 = new Person("Jane Doe");
//        Person person2 = new Person("John Smith");
//        Person person3 = new Person("Leroy Jenkins");
//
//        Person[] people = {person1, person2, person3};
//        for(Person Person : people){
//            System.out.println(Person.getName());
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a name:");
//        String userInput = scanner.nextLine();
//        System.out.printf("%s has been added to the array!%n", userInput);
//        Person[] newPeople = addPerson(userInput, people);
//        for(Person Person : newPeople){
//            System.out.println(Person.getName());
//        }


        ServerNameGenerator server1 = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        System.out.println(server1.getName());

    }







}
