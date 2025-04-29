public class ParkingZone {
    private static int count = 0;
    private Vehicle[] vehicles = new Vehicle[5];
    private String id;
    private int index = 0;

    public ParkingZone(){
        this.id = "Z"+ ++count;
    }

    public void addVehicle(Vehicle v) {
        vehicles[index++] = v;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[ Zone ID: " + id + ", Vehicles: ");
        for (int i = 0; i < 5; i++) {
            str.append(vehicles[i]);
        }
        str.append(" ]");
        return str.toString();
    }
}
