package AbstractYoutube;

public class Main {
//    Abstract classes cannot be instantiated, but they can have a subclass. Abstract methods are declared without an
//    implementation. The 'abstract' keyword can be applied to both classes and methods. The whole point of the
//    abstract keyword is to add a layer of security to your program.
//
//    This can be applied to both classes and methods.
//      If it is applied to a class, the user cannot instantiate an instance of an abstract class.
//      With an abstract method, they are declared without an implementation, but a child HAS to implement it
//      somewhere.

    //Think of this example of going to a car dealership. The salesperson approaches you and asks you what you are
    // looking to buy. You respond with "I want a vehicle please!" The salesperson looks at you confused because
    // while they do sell vehicles, they need to know something more specific, like if you want a car, truck, van,
    // etc. We can think of abstract classes in the same way. You would never tell someone you waant a vehicle,
    // rather that you want a car, even though a car IS a vehicle. Abstraction prevents you from using that class and
    // forces you to choose one of it's more specific children to implement methods from instead.


    //Vehicle vehicle = new Vehicle(); //We can no longer create a vehicle instance because the vehicle class is
    // abstract, which means it is too vague. In turn, we must force the user to use a child of the Vehicle class, in
    // this case it is car.
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
    }
}