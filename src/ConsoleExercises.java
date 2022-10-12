import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int userNumber = scanner.nextInt();
//        System.out.printf("Your number was: %d%n", userNumber);
//        What happens if you input something that is not an integer?
//        We will get an error


//        scanner.nextLine();
        System.out.println("Enter three words:");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.printf("Your words together make the following sentence: %n%s%n%s%n%s%n", userInput1, userInput2,
        userInput3 );
//
//        scanner.nextLine();
//        System.out.println("Enter a sentence:");
//        String sentence = scanner.nextLine();
//        System.out.printf("Your sentence was: %s.%n", sentence);

        System.out.println("What is the length of your classroom? (Enter your number in feet)");
        int userLength = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the width of your classroom? (Enter your number in feet)");
        int userWidth = scanner.nextInt();
        System.out.printf("The area of your classroom is: %dft. The perimeter of your classroom is: %dft.",
                (userLength*userWidth)
                , ((userWidth*2)+(userLength*2)));

    }
}
