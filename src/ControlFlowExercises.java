public class ControlFlowExercises {
    public static void main(String[] args) {
//        1. Loop Basics
//        a. Do While
// Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        }
//        while (i <= 50);
//    }

        //Alter your loop to count backwards by 5's from 100 to -10

//        int i = 20;
//        do {
//            System.out.println(i * 5);
//            i--;
//        }
//        while (i >= -2);
//    }

// Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        long i = 2L;
        do {
            System.out.println(i);
            i *= i;
        } while (i < 1000000L);
    }
}
