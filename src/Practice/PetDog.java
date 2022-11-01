package Practice;

import java.util.ArrayList;

public class PetDog extends Pet implements Companion{
    boolean trained;
//Write a constructor for PetDog that sets its name, type, and trained properties.
    public PetDog(boolean trained) {
        this.trained = trained;
    }

    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }
//Write an instance method in PetDog called isTrained that returns the boolean value of the trained property.
    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    @Override
    public String snuggle() {
        return getName() + " wants to snuggle";
    }

//12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
    public static void allSnuggle(ArrayList<PetDog> petDogs) {
        //for (PetDog)
    }
}
