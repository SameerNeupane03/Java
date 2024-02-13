class Vehicle{
    private String vehicleName;
    public int vehiclePrice;

    {
        vehicleName = "Null";
        vehiclePrice = 0;
    }

    Vehicle(){
        vehicleName = "Swift";
        vehiclePrice = 2000000;
    }

    public void setVehicleDetails(String vehicleName, int vehiclePrice){
      this.vehicleName = vehicleName;
      this.vehiclePrice = vehiclePrice;
    }

    public void showDetails(){
        System.out.println("Vehicle Name " + vehicleName + ", Vehicle Price " + vehiclePrice );
    }
}

class SuvVehicle extends Vehicle{
    private String carName;
    private int carPrice, carGear;

    {
        carName = "Creta";
        carPrice = 6000000;
        carGear = 4;
    }

    SuvVehicle(){
        carName = "Lamborghini Urus";
        carPrice = 120000000;
        carGear = 5;
    }

    //Function Overloading
    public void setVehicleDetails(String carName, int carPrice, int carGear){
     this.carName = carName;
     this.carPrice = carPrice;
     this.carGear = carGear;
    }
   
    //Function Overriding
    public void showDetails(){
        System.out.println("Car Name " + carName + ", Price " + carPrice + ", Gear " + carGear );
    }
}

public class FunctionOverloadingAndOverriding {
    public static void main(String[] args){
    SuvVehicle Suv1 = new SuvVehicle();
    Suv1.setVehicleDetails("TOYOTA Fortuner", 35000000, 5);

    Suv1.showDetails();
    }
}
