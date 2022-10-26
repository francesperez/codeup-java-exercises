package Groceries;
import util.Input;

import java.util.Objects;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String choice = "y";
        do{
            System.out.println("Do you want to make a grocery list? (y/n)"); //Replace this with your code
            choice = scanner.next();

        }while (choice.equalsIgnoreCase("y"));
        scanner.close();


    }//end of main
} //end of class


