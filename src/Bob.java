import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String goAgain = "y";
        while (goAgain.equalsIgnoreCase("y")) {
            System.out.println("Say something to Bob: ");
            String i = scanner.nextLine();
                if (i.contains("?")) {
                    System.out.println("Sure.");
                } else if (i.contains("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (i.equals("")) {
                    System.out.println("Fine. Be that way!");
                } else {
                    System.out.println("Whatever");
                }
                System.out.print("Oh you're still talking? (y/n): ");
                goAgain = scanner.next();
                scanner.nextLine();
            }





    }//end of main
}//end of class

