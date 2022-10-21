package vehicles;

public class Garage {
    private Vehicle[] vehicles;

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void alarmCarscade(){
        for (Vehicle vehicle : vehicles){
            vehicle.alarm();
        }
    }
}
