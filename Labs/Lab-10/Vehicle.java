public class Vehicle {
    String liscencePlate;
    String type;
    Owner owner;

//    Vehicle[] vehicle = new Vehicle[10];
//    private int indexOfVehicle = 0;
//
//    private boolean checkDuplicateVehicles(String liscencePlate, String type, Owner owner){
//        boolean isTrue = false;
//        for(int i = 0; i < indexOfVehicle; i++){
//            if (
//                    (vehicle[indexOfVehicle].liscencePlate == liscencePlate) && (vehicle[indexOfVehicle].type == type) && (vehicle[indexOfVehicle].owner.equals(owner))
//            ) {
//
//                return true;
//            }
//        }
//
//        if(!isTrue){
//            return false;
//        }
//        else{
//            return true;
//        }
//    }

    public Vehicle(String liscencePlate, String type, Owner owner) {
//        if(!checkDuplicateVehicles(liscencePlate, type, owner)) {
//            this.liscencePlate = liscencePlate;
//            this.type = type;
//            this.owner = new Owner(owner);
//            //vehicle[indexOfVehicle].owner = new Owner(owner);
//            //vehicle[indexOfVehicle].type = type;
//            //vehicle[indexOfVehicle].liscencePlate = liscencePlate;
//            //indexOfVehicle++;
//        }
        this.liscencePlate = liscencePlate;
        this.type = type;
        this.owner = new Owner(owner);
    }
}
