public class ParkingZone {
    private static int count = 0;
    Vehicle[] vehicles = new Vehicle[5];
    String id;
    private int index = 0;

    public ParkingZone(){
        this.id = "A"+ ++count;
    }

    public void addVehicle(Vehicle v) {
        vehicles[index++] = v;
    }
}
