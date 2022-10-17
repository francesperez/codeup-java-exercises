import java.util.Scanner;

public class MethodsExercise {

//    public static int addition(int x, int y) {
//        return x + y;
//    }
//    public static int subtraction(int x, int y) {
//        return x - y;
//    }
//    public static int multiplication(int x, int y) {
//        return x * y;
//    }
//    public static double division(double x, double y) {
//        return x / y;
//    }
//    public static int modulo(int x, int y) {
//        return x % y;
//    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter and integer between %d and %d:%n", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.printf("You entered %d", userInput);
            return userInput;
    } else {
        System.out.printf("You entered %d, which is out of the range", userInput);
    }   return getInteger(1,10);

}


 static long factorial(long n) {
         if (n !=0)
             return n * factorial(n-1); //https://www.programiz.com/java-programming/recursion used recursion method
//         from website
         else return 1;
     }

     public static int generateNumber(int max){
        return (int) Math.round(Math.random() * max);
     }

public static void rollDice(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number of sides for a pair of dice:");
            byte numberOfSides = scanner.nextByte();
                System.out.printf("Your dice have %d sides total.%n", numberOfSides);
            System.out.println("Do you want to roll? (y/n): ");
            String userContinue = scanner.next();
            if (userContinue.equalsIgnoreCase("y")){
                System.out.println("You rolled the dice!");
                System.out.printf("You rolled %d and %d!%n", generateNumber(numberOfSides),
                        generateNumber(numberOfSides));
            }
        }










    public static void main(String[] args) {
//        System.out.println(addition(43,100));
//        System.out.println(subtraction(900,33));
//        System.out.println(multiplication(11,11));
//        System.out.println(division(1312,4));
//        System.out.println(modulo(20,3));

//        Scanner scanner = new Scanner(System.in);
//        String userContinue = "y";
//        while (userContinue.equalsIgnoreCase("y")) {
//            System.out.println("Enter a number:");
//            long enterNumber = scanner.nextInt();
//
//            long number = enterNumber, result;
//            result = factorial(number);
//            System.out.println("The factorial of " + number + " is " + result);
//            System.out.println("Do you want to enter another number? (y/n): ");
//            userContinue = scanner.next();
//        }





       // getInteger(1,10);
        rollDice();



        }

    }


