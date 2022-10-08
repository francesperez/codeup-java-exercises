public class syntaxLecture {
//    The line below is referred to as the main class.
    public static void main(String[] args) {
//        We always have to declare the data type in Java. Declare the variable without initializing it.
        int weight;
        String breed;
//        Initialize after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
//        Or, you can initialize and declare all at once.
        String name = "Grinch";
        int cutenessFactor = 10;
//        Instead of using let or const, we use the data type: ex: int(integer) and String
//        Statement: "JVM, do something"
//        sout + tab for a shortcut of the below code
        //System.out.println(name + " is a " + breed + ".");
//        We also have conditional logic.
//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cuteness.");
//        }
        boolean inGrinchCute = true;
//        Char is a primitive, it's one character.

        char oneLetter = 'a';
//        There are four whole number types.
        byte smallNumber; //bytes go from -128 to 127
        short mediumNumber; //shorts go from -32768 to 32767
        int number; //integers go from -2 billion-ish to 2 billion-ish
        long bigNumber; //longs go about -9 quadrillion to 9 quadrillion
//It's going to declare an area of memory of fixed size.

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        number = 2000000000;
        smallNumber = (byte)number; //Casting is when we force it to change from one data type to another
        //The JVM was warning us of a lossy conversion. What happened was that it lopped off the binary code. Really,
        // it will let us stuff 4 bytes into 1 byte, but it will cut off the binary code at an arbitrary point.
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);
        //Moral of the story is that when we try to put something big into something small, we lose our data.

        bigNumber = 9000000000000000000L;

//        floats and doubles
//        Floats can go up to 7 decimal places. Doubles go up to 16 decimal places.
        float imaFloat = 2.345F;
        double imadouble = 9.0375987349857;
        System.out.println(imadouble);
        imaFloat = (float) imadouble;
        System.out.println(imaFloat);

    }
}
