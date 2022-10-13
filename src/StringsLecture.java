import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        String teacher ="teacher";
        System.out.println(teacher);
        teacher = "not teacher";
        String javier = "Javier";
        String anotherJavier = "Javier";
        System.out.println(teacher);
        System.out.println(javier);
        System.out.println(javier.hashCode());
        System.out.println(anotherJavier.hashCode());
//        There is a place inside Java memory called the string pool. When you save a string of any sort it gets
//        saved in the String pool until the end of the program runs. As we understand it, if you declare another
//        variable with the same string value, as we did above with javier and anotherJavier, both of them would be
//        referring to the same place in memory.
        System.out.println(javier == anotherJavier);
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        System.out.println(javier.equals(userInput));
    }
}
