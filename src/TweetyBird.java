public class TweetyBird extends PolymorphismandInheritanceLecture{

    public static String order = "Psittaciforms";

    public void setName(String tweetyName){
        super.name = tweetyName;
    }
public void makeNoise(){
    System.out.println("TWEEEEUT TWEEEEUT");
}
public void echo(String input){
    System.out.println(input);
}

public TweetyBird(){
    super(); //this happens automatically by defualt and doesn't need to be written. However, we can declare the
    // super class like this which means RUN the superclass constructor. Again, by defualt, it is already doing this.
    System.out.println("A new tweety bird just got created!");
}

}