package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        //Vehicle[] garageVehicles = new Vehicle[4];
        Car dailyCommuter = new Car("Honda Civic");
        Car truck = new Car("Toyota Tacoma");
        Car muscleCar = new Car("Dodge Charger");
        Car luxuryVehicle = new Car("Lexus is500");
//        garageVehicles[0] = dailyCommuter;
//        garageVehicles[1] = truck;
//        garageVehicles[2] = muscleCar;
//        garageVehicles[3] = luxuryVehicle;
        Vehicle[] garageVehicles = {dailyCommuter, truck, muscleCar, luxuryVehicle}; //Shorter way to write the above
        // code
        garage.setVehicles(garageVehicles);
        garage.alarmCarscade();
        garage.getVehicles()[1] = new motorcycle("Suzuki");
        System.out.println(garage.getVehicles()[1].getName()); //This is a polymorphic return type???

       // garage.setVehicles(new Vehicle[4]);
        //now we gotta put our vehicles in



    }
}
