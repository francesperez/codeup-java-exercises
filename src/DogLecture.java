//public class is called an access modifier; it means we can access this class from anywhere inside our java program.
// Java programs are multi files (many classes together). Public means this particular class can be accessed anywhere
// inside our project. Void means it doesn't return anything; it simply just 'souts'. Java is picky as far as
// variable definition. Likewise, when we write a function, we have to explicitly say what type the function is
// returning.
public class DogLecture {
    //        Methods are the equivalent of functions, but they are always attached to an object.

    public static String bark() {
//        The use of void is if you write a function that doesn't return anything
        return "Woof Woof!";
    }//End of bark method

     public static void bark(int weight){
//        Here we can write two versions of the same method. This is called overloading. It only has to be different
//        in either parameters or data types.
         if (weight < 25){
             System.out.println("Yip yip");
         } else {
             System.out.println("Woof woof");
         }
     }
     public static void bark(int weight, String name){
//        String output = name + " goes ";
//        if (weight < 25){
//            output += "yip yip!";
//        } else {
//            output += "woof woof!";
//         }
//         System.out.println(output);
         System.out.printf("% goes", name);
         bark(weight);
     }

    public static void main(String[] args) {
//      It is very useful to have multiple methods that define the same thing as long as they have different
//      parameters.
//        bark();
//        bark(15);
//        bark(50);
//        bark(50, "Rudy");
//        bark(15, "Qweetus");

        System.out.println(bark());












    } //End of main method
}//end of class

