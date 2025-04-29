
public class ParkingSystem{

    private String campusName;
    private Supervisor supervisor;
    private static int indexParkingZone = 0;
    private static int indexPermitHolder = 0;
    private ParkingZone[] parkingZone = new ParkingZone[2];
    private PermitHolder[] permitHolder = new PermitHolder[2];
    private static int count = 0;

    public ParkingSystem(String campusName, Supervisor supervisor){
        if (count == 0){
            this.campusName = campusName;
            this.supervisor = supervisor;
            count++;
        }
        else{
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance");
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Campus: " + campusName + "\n");
        str.append("Supervisor: " + supervisor + "\n");
        str.append("Zones: ");
        str.append(" [ ");
        for(int i = 0; i < 2; i++){
            str.append(parkingZone[i]);
        }
        str.append(" ]");
        str.append("\nPrmit Holders: ");
        str.append(" [ ");
        for(int i = 0; i < 2; i++){
            str.append(permitHolder[i]);
            str.append(", ");
        }
        str.append(" ]");
        str.append("\n");
        return str.toString();
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