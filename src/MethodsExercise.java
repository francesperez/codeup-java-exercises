import java.util.Scanner;

public class MethodsExercise {

//    public static int addition(int x, int y) {
//        return x + y;
//    }
//
//    public static int subtraction(int x, int y) {
//        return x - y;
//    }
//
//    public static int multiplication(int x, int y) {
//        return x * y;
//    }
//
//    public static int division(int x, int y) {
//        return x / y;
//    }
//
//    public static int modulo(int x, int y) {
//        return x % y;
//    }

//    public static int getInteger(int i, int min, int max){
//        if (i > min && i < max){
//            System.out.println("Yip yip");
//        } else {
//            System.out.println("Woof woof");
//        }
//    }
 public static double dice(int sides){
     double random = Math.floor(java.lang.Math.random() * sides);
     return random;
 }


 static int factorial(int n) {
     if (n !=0)
         return n * factorial(n-1);
     else return 1;
 }


    public static void main(String[] args) {
//        System.out.println(addition(43,100));
//        System.out.println(subtraction(900,33));
//        System.out.println(multiplication(11,11));
//        System.out.println(division(1312,4));
//        System.out.println(modulo(20,3));

        int number = 4, result;
        result = factorial(number);
        System.out.println(number + "! = " + result);



    }
}
