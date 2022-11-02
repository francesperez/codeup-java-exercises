public class RecursionLecture {
//What is recursion? --> a function that calls itself
//What is a recursive problem?/What kind of problems can recursion solve? --> A problem whose definition(or answer or
// solution) is expressed in smaller terms of itself
//Requirements for a recursive solution.
    //Answer is expressed in smaller terms of itself.
    //Answer has an escape clause, i.e., a way to STOP calling itself.
    //*These are also called the HALLMARKS of a recursive problem.
//Pros of recursion:
    //In general; they are easier to read.
    //A recursive definition is a near perfect roadmap for implementing the solution, i.e. programming it
    //The code looks JUST LIKE the recursive definition.
    //Takes less code compared to other solutions.
//Cons of recursion:
    //Tend of be computationally inefficient.
    //Can kill your program; the space which your computer gives you to run can run out.
    //Coming up with a recursive definition of a solution can be really hard.

//========EXAMPLE ONE: FACTORIAL=========
//n factorial(n!) is the product of all positive integers less than or equal to n.
    public static long fact (long n){
        if (n == 1 || n ==2){
            return n;
        }
        return n * fact(n-1); //recursive definition is what makes it stop
    }
// ==========EXAMPLE TWO: FIBONACCI=============
//    public static long fib(int n){
//        if(n ==0){
//            return 0;
//        }
//        if (n == 1){
//            return 1;
//        }
//        return fib(n-1) + fib(n-2);
//    }
//This is calculating the same thing over and over again, leading to performance problems. We need to get rid of
// calculating the same thing over and over again and rather, lookup n in some kind of array, to see if it has
// already been calculated. If yes, return that value. If no, calculate it normally and then save it before returning
// it.
//================MEMOIZATION==================
//    private static final long  memoTable [] = new long[MAX];
//    public static long fib(int n){
//        if (n == 0 ){
//            return 0;
//        }
//        if (n ==1){
//            return 1;
//        }
//        if (memoTable[n] != 0) {
//            return memoTable[n];
//        }
//        long fibN = fib(n - 1) + fib(n - 2);
//        memoTable[n] = fibN;
//        return fibN;
//    }

//Recursive solutions are elegant as long as they don't kill your program. Use them when you know HOW your program
// will use the recursive function. If you expect large data sets, you should look for a non-recursive algorithm.

//============HEAD RECURSION===============
    //The recursive call IS NOT the last statement in the function.
    //The function does its "work" AFTER the recursive call(s).
    //Our fib() functions are head recursive

//===============TAIL RECUSION=============
    //

//===============EXERCISE===================
    //1. Write the recursive definition of an algorithm to find the minimum value in an array of ints. Express the
    // definition as the 2 hallmarks.
        public static int findMin(int A[], int n) {
            if(n == 1)
                return A[0];
            return Math.min(A[n-1], findMin(A, n-1));
}

    public static void main(String[] args) {
       //System.out.println(fact(4));
        long start = System.currentTimeMillis();
//        System.out.println(fib(30));
//        System.out.println("Time " + (System.currentTimeMillis() - start));

        int A[] = {1, 4, 45, 6, -500, -910, 2};
        int n = A.length;
        System.out.println(findMin(A, n));
    }

}

