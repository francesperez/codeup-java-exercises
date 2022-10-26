package ExceptionErrorHandlingLecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingYoutube {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//Events that occur during the execution of a program that disrupt the normal flow of the program.
try { //Any code that is considered 'dangerous', can still be fired within the try-block.

    System.out.println("Enter a whole number to divide by: ");
    int x = scanner.nextInt();

    System.out.println("Enter a whole number to divide by: ");
    int y = scanner.nextInt();

    int z = x / y;

    System.out.println("Result: " + z);

}
catch(ArithmeticException e){ //we will preform whatever is in the catch block. They will 'catch' specific exceptions
    // and handle them.
    System.out.println("You can't divide by zero, idiot!");
}

catch(InputMismatchException e){ //when we type in a string, we end up with an inputmismatchexception, which is being
    // caught right here!
    System.out.println("Please enter an actual number, stupid!");
}

finally { //whatever is within the finally-block will always get executed. This is useful for open scanners or files
    // that we want to close or anything else we want to do before the end of the program.
    System.out.println("This will always print!");
    scanner.close();
}


//WHEN WE DIVIDE BY ZERO WE GET AN ARETHMETIC EXCEPTION. ONE WAY WE CAN HANDLE THESE EXCEPTIONS IS SURROUNDING THE
// DANGEROUS CODE WITH A TRY BLOCK.
}
}
