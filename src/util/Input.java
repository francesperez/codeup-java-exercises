package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner;
    static String getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string and I'll repeat it: ");
        return scanner.nextLine();
    }
    static boolean yesNo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yes or No?");
        return scanner.next().charAt(0) == 'y';
    }
    static int getInt(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter an number between %s and %s to continue:%n", min, max);
        int numbers = scanner.nextInt();
        if (numbers > min && numbers < max){
            return numbers;
        } else return getInt(min, max);
    }
    static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and I'll repeat it: ");
        return scanner.nextInt();
    }
    static double getDouble(double min, double max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s to continue:%n", min, max);
        double numbers = scanner.nextDouble();
        if (numbers > min && numbers < max){
            return numbers;
        } else return getDouble(min, max);
    }
    static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and I'll add a decimal point at the end: ");
        return scanner.nextDouble();
    }


}
