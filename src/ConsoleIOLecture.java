import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
//        https://docs.oracle.com/javase/tutorial/java/data/numberformat.html for what each % means
//        The %s (substitution) will be replaced with the value of the variable.
//        !%n means new line

//        System.out.printf("Good %s, %s!%n",timeOfDay, cohort);
//        'souf' will not print on separate lines!
//        System.out.printf("This is the %dth week of the %s cohort.%n", week, cohort);
//        System.out.println("Will this be on a separate line?");
//        If we do sou ln it will print on a separate line
//        System.out.println("How about this?");
//        The first number here determines how many spaces the number will occupy.
//        System.out.printf("The number is %7.3f%n", someNumber);
//        System.out.printf("The number is %-11.3f test%n", week);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a sentence:");
//        String userInput = scanner.nextLine();
//        System.out.printf("Your sentence was: %s.%n", userInput);
        System.out.println("Enter a number:");
        //int userNumber = Integer.parseInt(scanner.nextLine());
        int userNumber = scanner.nextInt();
        System.out.printf("Your number was: %d%n", userNumber);
        System.out.println("Enter another sentence:");
//        String ghost = scanner.nextLine();
        scanner.nextLine();
        String secondSentence = scanner.nextLine();
        System.out.printf("Your second sentence was %s.%n", secondSentence);





    }


}
