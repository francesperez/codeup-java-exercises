public class ControlFlowExercises {
    public static void main(String[] args) {
//        2. Fizz Buzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        int i = 1;
        for (i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
        else if(i%3 == 0) {
            System.out.println("Fizz");
        } else if(i%5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

