public class PolyandInhTest {
    public static void main(String[] args) {
        PolymorphismandInheritanceLecture crow = new PolymorphismandInheritanceLecture();
        crow.setName("Dr. Crow");
//        System.out.print(crow.getName() + " goes ");
        crow.makeNoise();
        TweetyBird goldfinch = new TweetyBird(); //When you have a superclass and extend it into an extended class,
        // that is the subclass of the superclass. Therefore, anything you put in the superclass gets inherited by the
        // extended class.
        goldfinch.setName("Goldy");
//        System.out.print(goldfinch.getName() + " goes ");
        goldfinch.makeNoise();

//        Example of polymorphism
        PolymorphismandInheritanceLecture goldfinch2 = new TweetyBird();
        goldfinch2.makeNoise();
        goldfinch2.setName("Mockingbird");
        System.out.println(goldfinch2.getName());

//        Example of a polymorphic array
        PolymorphismandInheritanceLecture[] birds = new PolymorphismandInheritanceLecture[3];
        birds[0] = new TweetyBird();
        birds[0].setName("Pookie");



    }
}
