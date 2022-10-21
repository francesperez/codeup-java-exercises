public class PolyandInhTest {
    public static void main(String[] args) {
//        PolymorphismandInheritanceLecture crow = new PolymorphismandInheritanceLecture();
//        crow.setName("Dr. Crow");
//        System.out.print(crow.getName() + " goes ");
//        crow.makeNoise();
//        TweetyBird goldfinch = new TweetyBird(); //When you have a superclass and extend it into an extended class,
        // that is the subclass of the superclass. Therefore, anything you put in the superclass gets inherited by the
        // extended class.
//        goldfinch.setName("Goldy");
//        System.out.print(goldfinch.getName() + " goes ");
//        goldfinch.makeNoise();

//        Example of polymorphism
//        PolymorphismandInheritanceLecture goldfinch2 = new TweetyBird();
//        goldfinch2.makeNoise();
//        goldfinch2.setName("Mockingbird");
//        System.out.println(goldfinch2.getName());

//        Example of a polymorphic array
//        PolymorphismandInheritanceLecture[] birds = new PolymorphismandInheritanceLecture[3];
//        birds[0] = new TweetyBird();
//        birds[0].setName("Pookie");


        TweetyBird tweety = new TweetyBird(); //two constructors ran because of inheritance; tweetybird might have
        // methods and properties that belong to the 'bird' lecture; the jvm must first create a bird so that its
        // properties and methods exist first before creating tweetybird to that the resulting object can create from
        // both the superclass and multiclass.
        tweety.setName("Polly");
        System.out.println(tweety.name);
        System.out.println(tweety.order);


//you cannot extend, change, ovveride a final method

    }
}
