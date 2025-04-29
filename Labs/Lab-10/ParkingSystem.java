public class ParkingSystem{

    String campusName;
    Supervisor supervisor;
    private int indexParkingZone = 0;
    private int indexPermitHolder = 0;
    ParkingZone[] parkingZone = new ParkingZone[2];
    PermitHolder[] permitHolder = new PermitHolder[2];
    static int count = 0;

    public ParkingSystem(String campusName, Supervisor supervisor){
        if (count == 0){
            this.campusName = campusName;
            this.supervisor = supervisor;
            count++;
        }
        else{
            System.out.println("The object alreaduy exists.");
        }
    }

    public static ParkingSystem getInstance(String campusName, Supervisor supervisor) {
        return new ParkingSystem(campusName, supervisor);
    }

    public void addPermitHolder(PermitHolder ph) {
        permitHolder[indexPermitHolder++] = ph;
    }

    public void addZone(ParkingZone zone) {
        parkingZone[indexParkingZone++] = zone;
    }
}