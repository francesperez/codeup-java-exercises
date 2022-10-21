package vehicles;

public class motorcycle extends Vehicle {
    public void makeNoise(){
        System.out.println("beep beep kiss kiss!");
    }

    //no-arg constructor
    public motorcycle(){};

    //constructor
    public motorcycle(String name){
        this.setName(name);
    }
}
