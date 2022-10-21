public class PolymorphismandInheritanceLecture {
    protected String name; //can be accessed anywhere in the inheritance hierarchy

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public PolymorphismandInheritanceLecture(){
        System.out.println("A bird just got constructed!"); //
    }
    public void makeNoise(){
        System.out.println("EEEECAWWWWWCAWWW");




    }
}
