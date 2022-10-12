public class ControlFlowExercises {
    public static void main(String[] args) {
//        1. Loop Basics
//        c. For
//        Refactor the previous two exercises to use a for loop instead.
        int counter = 100;


        for(int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

        for(long i = 2L; i < 1000000; i *= i) {
            System.out.println(i);
        }
    }
}
