package vehicles;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("HONK HOOOOONK!!");
    }

    public void alarm(){
        System.out.println("WEEEEWOOOOOOWWEEEEEEWOOOOO!");
        }

        public Vehicle(){}

        public Vehicle(String name) {
        this.name = name;
    }
}
