package vehicles;

public class VehicleTest {
    public static void main(String[] args) {
    Vehicle EighteenWheeler = new Vehicle();
    EighteenWheeler.setName("Eighteen Wheeler");
    System.out.print(EighteenWheeler.getName() + " made the sound: ");
        EighteenWheeler.makeNoise();

    motorcycle motorcycle = new motorcycle();
    motorcycle.setName("Motorcycle");
    System.out.print(motorcycle.getName() + " made the sound: ");
    motorcycle.makeNoise();

}

}
