abstract class Vehicle{
       private String vehicleName;
       private int vehicleMileage;

       //instance initialization block
       {
          vehicleName = "Fortuner";
          vehicleMileage = 10;
       }

       public void setVehicleName(String vehicleName){
        this.vehicleName = vehicleName;
       }

       public void setVehicleMileage(int vehicleMileage){
        this.vehicleMileage = vehicleMileage;
       }

       public String returnVehicleName(){
        return vehicleName;
       }

       public int returnVehicleMileage(){
        return vehicleMileage;
       }

       public abstract void setVehicleDetails(String vehicleName, int vehicleMileage);
       public abstract void showVehicleDetails();
}

class Pajero extends Vehicle{

    public void setVehicleDetails(String vehicleName, int vehicleMileage){
    super.setVehicleName(vehicleName);
    super.setVehicleMileage(vehicleMileage);
    }

    public void showVehicleDetails(){
            System.out.println("Vehicle Name: " + returnVehicleName() + "\t Mileage: " + returnVehicleMileage());
    }
}

public class AbstractKeyword {
    public static void main(String[] args){
      Vehicle firstPajero = new Pajero();                               //Reference variable of Vehicle class
      firstPajero.setVehicleDetails("Pajero",12);
      firstPajero.showVehicleDetails();
    }
}
