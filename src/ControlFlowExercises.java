import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        3. Display a table of powers
//        Scanner scanner = new Scanner(System.in);
//        String userContinue = "y";
//        while (userContinue.equalsIgnoreCase("y")){
//            System.out.println("Enter a number:");
//            int enterNumber = scanner.nextInt();
//            System.out.println("Number" + "   " + "Squared" + "   " + "Cubed");
//            System.out.println("======" + "   " + "=======" + "   " + "=====");
//
//            for (int i = 1; i <= enterNumber; i++) {
//                i = enterNumber;
//                int iSquared = (int) Math.pow(i, 2);
//                int iCubed = (int) Math.pow(i, 3);
//
//                String output =  i + "         " + iSquared + "         " + iCubed;
//                System.out.println(output);
//                System.out.println();
//
//                System.out.print("Do you want to enter another number? (y/n): ");
//                userContinue = scanner.next();
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        String goAgain = "y";
        while (goAgain.equalsIgnoreCase("y")) {
            System.out.println("Enter your grade between 0-100: ");
            int i = scanner.nextInt();
                if (i <= 59) {
                    System.out.println("You got an F.");
                } else if (i >= 60 && i <= 66) {
                    System.out.println("You got a D.");
                } else if (i >= 67 && i <= 79) {
                    System.out.println("You got a C.");
                } else if (i >= 80 && i <= 87) {
                    System.out.println("You got a B.");
                } else if (i >= 88 && i <= 100) {
                    System.out.println("You got a A.");
                } else {
                    System.out.println();
                }
                System.out.print("Do you want to enter another number? (y/n): ");
                goAgain = scanner.next();
            }
        }
    }



