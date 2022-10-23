package InterfacesYoutube;

public class MainTest {
    public static void main(String[] args) {
        //Intercaes are temples that can be applied to a class. Similar to inheritance, but specifies what a class
        // has/must do. Classes can apply to more than one interface, inheritance is limited to 1 superclass.

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
