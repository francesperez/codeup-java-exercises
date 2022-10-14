import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {

//========================STRING IMMUTABILITY======================================
//    JAVA's way of saving memory. If there are multiple strings with the exact same character pattern, they will be
//    sdtored in the same place.


        String javier = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(javier)))); //This is the best approximation
        // we can get to converting the internal address of an object into a number. Again, internal address means
        // when you save a variable, the computer has to know where in memory to look for that value.
        String anotherJavier = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(anotherJavier))));
//        In theory, the identityHashcode is more accurately identifying the address vs. hashCode.

        System.out.println(javier);
        System.out.println(javier.hashCode());
        System.out.println(anotherJavier.hashCode());
//        There is a place inside Java memory called the string pool. When you save a string of any sort it gets
//        saved in the String pool until the end of the program runs. As we understand it, if you declare another
//        variable with the same string value, as we did above with javier and anotherJavier, both of them would be
//        referring to the same place in memory.
        javier = javier + " Ruedas";
        anotherJavier = javier;

        System.out.println(anotherJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        System.out.println(Integer.toHexString((System.identityHashCode(anotherJavier))));

        String doiwork = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(doiwork))));



        System.out.println(javier == anotherJavier);
//        Why should we not use double equals? Because it does not reference the strings, but rather their references
//        . Since they are both references to the same place in memory, it will come out true even though we changed
//        javier to Javier Ruedas earlier.  We don't want to know if the reference addresses are the same, but that
//        the strings are the same.

//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.next();
//        System.out.println(javier.equals(userInput));


//    }
    }
}
