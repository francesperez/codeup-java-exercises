package util;

import java.util.Scanner;
//
//public class Input {
//    private Scanner scanner;
//
//    public Scanner getScanner() {
//        return scanner;
//    }
//    public void setScanner(Scanner scanner) {
//        this.scanner = scanner;
//    }
//
//    public String getString(){
//        System.out.println("Enter your input:");
//        return scanner.nextLine();
//    }
//
//    public String getString(String prompt){
//        System.out.println(prompt);
//        return scanner.nextLine();
//    }
//
//    public boolean yesNo(){
//        System.out.println("Yes or No?");
//        String userInput = scanner.nextLine();
//        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") ;
//    }
//    public int getInt(int min, int max){
//        System.out.printf("Enter an number between %s and %s to continue:%n", min, max);
//        int numbers = scanner.nextInt();
//        if (numbers > min && numbers < max){
//            return numbers;
//        } else return getInt(min, max);
//    }
//
//    public int getInt(){
//        System.out.println("Enter a number: ");
//        return scanner.nextInt();
//    }
//    public double getDouble(double min, double max){
//        System.out.printf("Enter a number between %s and %s to continue:%n", min, max);
//        double numbers = scanner.nextDouble();
//        if (numbers > min && numbers < max){
//            return numbers;
//        } else return getDouble(min, max);
//    }

//
//
//    public double getDouble(){
//        System.out.println("Enter a number: ");
//        return scanner.nextDouble();
//    }
//
//    public Input(){
//        scanner = new Scanner(System.in);
//    }
//}

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // Solution: David Lara and John Pedrotti
    public boolean yesNo(){
        System.out.println("Yes or no?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    /*
        TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
     */
        public int getInt(){
           String userInput = getString();
           try {
               return Integer.valueOf(userInput);
           } catch(NumberFormatException e){
               System.out.println("Invalid number, try again!");
               return getInt();
           }
        }

    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        String prompt = "Enter an integer between " + min + " and " + max + ":";
        System.out.println(prompt);
        int userInput = getInt();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    /*
        TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
         to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
     */
    public double getDouble(){
        String userInput = getString();
        try {
            return Double.parseDouble(userInput);
        } catch(NumberFormatException e){
            System.out.println("Invalid number, try again!");
            return getDouble();
        }
    }

    public double getDouble(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    public double getDouble(double min, double max){
        String prompt = "Enter an number between " + min + " and " + max + ":";
        System.out.println(prompt);
        double userInput = getDouble();
        while (userInput < min || userInput > max){
            System.out.println(prompt);
            userInput = scanner.nextDouble();
        }
        return userInput;
    }
}
