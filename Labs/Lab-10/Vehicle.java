
class Vehicle {
    private String licensePlate;
    private String type;
    private Owner owner;

    private static String[] liscences = new String[10];
    private static int liscencesIndex = 0;

    public Vehicle(String licensePlate, String type, Owner owner) {
        boolean isTrue = true;
        for(int i = 0; i < 10; i++){
            if(liscences[i] == licensePlate){
                System.out.println("Error: Duplicate Liscence Plate " + licensePlate + " is not allowed.");
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            this.licensePlate = licensePlate;
            this.type = type;
            this.owner = owner;

            liscences[liscencesIndex++] = licensePlate;
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Owner getOwner() {
        return owner;
    }

    public Vehicle shallowCopy() {
        return new Vehicle(licensePlate, type, owner);
    }

    public Vehicle deepCopy() {
        Owner newOwner = new Owner(owner.getName());
        return new Vehicle(licensePlate, type, newOwner);
    }

    @Override
    public String toString() {
        return "Liscence Plate: " + licensePlate + ", Type: " + type + ", Owner: [" + owner + "] ";
    }
}