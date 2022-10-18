package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }



    public String getString(){
        System.out.println("Enter your input:");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        return scanner.next().charAt(0) == 'y';
    }
    public int getInt(int min, int max){
        System.out.printf("Enter an number between %s and %s to continue:%n", min, max);
        int numbers = scanner.nextInt();
        if (numbers > min && numbers < max){
            return numbers;
        } else return getInt(min, max);
    }
    public int getInt(){
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s to continue:%n", min, max);
        double numbers = scanner.nextDouble();
        if (numbers > min && numbers < max){
            return numbers;
        } else return getDouble(min, max);
    }
    public double getDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextDouble();
    }

    public Input(){
        scanner = new Scanner(System.in);
    }
}
