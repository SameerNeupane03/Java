class Vehicle{
    private String vehicleName;
    private int vehiclePrice, vehicleMileage;
    public void setVehicleData(String VehicleName, int VehiclePrice, int VehicleMileage){
    vehicleName =    VehicleName;
    vehiclePrice =   VehiclePrice;
    vehicleMileage = VehicleMileage;
    }

    public void showVehicleData(){
        System.out.println("Vehicle Name: " + vehicleName + "\t" + " Price: " + vehiclePrice + "\t Mileage: " + vehicleMileage);
    }
}

class MainVehicle{
    public static void main(String args[]){
        Vehicle vehicleType = new Vehicle();
        vehicleType.setVehicleData("Lambourghini Urus",40000000, 8);
        vehicleType.showVehicleData();
    }
}