//class Person {
//    public String firstName; //This is called an instance variable aka. field
//    public String lastName; //This is called an instance variable aka. field
//
//    public String sayHello() {
//        return String.format("Hello from %s %s!", firstName, lastName); //method.
//    }
//
//    public static void main(String[] args) {
//        Person rick = new Person();
//        rick.firstName = "Rick";
//        rick.lastName = "Sanchez";
//        System.out.println(rick.sayHello());
//        // prints "Hello from Rick Sanchez!"
//    }
//}


//Create a class for your favorite type of animal. The class should be named for your animal - Cat, Dog, Parrot etc. It should have two instance variables - name and sound - and one method - makeNoise(). The output of the makeNoise method should be name +  " goes " + sound. Create a test class with a main method to instantiate and test your class code.


//class favAnimal {
//    public String name;
//    public String sound;
//
//    public String makeNoise(){
//        return String.format(name + " goes " + sound + "");
//    }

//    public static void main(String[] args) {
//    favAnimal bat = new favAnimal();
//    bat.name = "Fruit Bat";
//    bat.sound = "eeeeeeeek";
//        System.out.println(bat.makeNoise());
//    }
//}

//Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.

//class Quote {
//    public static String randomQuote () {
//        int rand = (int) (Math.random() * 4) + 1;
//        String q1 = "Power without principle is barren, but principle without power is futile. " +
//                "This is " +
//                "a " +
//                "party of " +
//                "government, and I will lead it as a party of government.";
//        String q4 = "I liken myself to Henry Ford and the auto industry, I give you 90 percent of what most people " +
//                "need.";
//        String q2 = "Behold, my friends, the spring is come the earth has gladly received the embraces of the sun, and we shall soon see the results of their love!";
//        String q3 = "Yeah, I love being famous. It\'s almost like being white, y\'know?";
//        if (rand == 1) {
//            return q1;
//        } else if (rand == 2) {
//            return q2;
//        } else if (rand == 3) {
//            return q3;
//        } else {
//            return q4;
//        }
//    }
//
//    public static void main(String[] args) {
//    favAnimal bat = new favAnimal();
//    bat.name = "Fruit Bat";
//    bat.sound = randomQuote();
//
//        System.out.println(bat.makeNoise());
//    }
//}

//A static method is not meant to belong to an instance of a class, but rather a class itself. It runs off of an
// entire clas.s Therefore, static methods cannot use instance variables. If the purpose of an instance variable is
// to existence in a certain instance of a class but the purpose of a static method is to run off the class itself
// then the instance variable may not exist when the static method is run.

//There is also such thing as a static variable. Let's say we want to have a bunch of classes for multiple items(ex.
// weapons). The max damage each of these items can cause will be different.


//Create an Employee class. The employee class should have a name instance variable, a static company variable set to
// Veridian Dynamics, and a non-static method displayEmployeeInfo(). displayEmployeeInfo() should generate a string, name + " works at " + company. Create a test class that instantiates three employee objects with different names. Run displayEmployeeInfo on all of them to show that each has access to the employee static variable. Bonus: write a method that has the employee emit a random quote and test it.
class Employee { //defines what the employee properties are and what it's methods are and also how one of them comes
    // into existence
    public String name;// instance variable: this is going to be when you create an object, it is attached to THAT
    // instance. Variable -  it is always going to change, not be the same thing every single time.
    public static String company = "Veridian Dynamics"; //static variable: it's not something that can be accessed
    // and changed directly. In terms of keeping things locked down, we don't want this static to be changed by the
    // 'public'.
    public String displayEmployeeInfo() {  //Instance method
        return name + " works at " + company;
    }

    public Employee(){
        //It is good habit to include the default constructor(aka no-arg constructor) here in addition to the
        // customized constructor below
    }
//All classes have a default constructor that we don't need to type out. When we define the constructor below, we are
// 'customizing' the constructor.
    public Employee(String name){
        System.out.println("We have a new employee!"); //This is an extra constructor(aka overloaded constructor) that
        // lives inside
        // the class of
        // the same name.
        this.name = name; //I added this during Gonzalo's  lecture
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee("Pablo"); //'employee1' is a reference variable //added during Gonzalo's
        // lecture
//        Employee employee2 = new Employee(); //Putting it all together, the whole thing is called: instance of a class
//        Employee employee3 = new Employee();//the keyword new is used to invoke a constructor.

//        employee1.name = "Pablo"; //Class where objects are instantiated
//        employee2.name = "Yeetus"; //New object
//        employee3.name = "Checo";
        System.out.println(employee1.displayEmployeeInfo());
//        System.out.println(employee2.displayEmployeeInfo());
//        System.out.println(employee3.displayEmployeeInfo());
    }
}




