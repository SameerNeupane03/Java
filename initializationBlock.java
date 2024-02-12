  class Vehicle{
    private String vehicleName;
    private int vehiclePrice, vehicleMileage;

    {
        vehicleName = "Unknown";
        vehiclePrice = 0;
        vehicleMileage = 7;
    }

       Vehicle(){
        vehicleName = "Lamborghini Urus";
        vehiclePrice = 120000000;
        vehicleMileage = 6;
       }

       Vehicle(String vehicleName, int vehiclePrice){
        this.vehicleName = vehicleName;
        this.vehiclePrice = vehiclePrice;
       }

       public void showVehicleDetails(){
        System.out.println("Vehicle Name " + vehicleName + ", Price " + vehiclePrice + ", Mileage " + vehicleMileage);
       }

 }
 
 public class initializationBlock{
     public static void main(String[] args){
       Vehicle firstBlock = new Vehicle(" TOYOTA Land Cruiser ", 4_00_00_000);
       firstBlock.showVehicleDetails();
     }  

    }
