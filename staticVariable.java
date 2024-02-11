class Depositer{
   String depositerName;
   int depositerAge;
   int depositerPrinciple;
   static double rateOfInterest;

   public void setDepositerDetails(String nameOfDepositer, int ageOfDepositer, int principleOfDepositer, double interestRate){
    depositerName = nameOfDepositer;
    depositerAge = ageOfDepositer;
    depositerPrinciple = principleOfDepositer;
    rateOfInterest = interestRate;
   }

   public void showDepositerDetails(){
    System.out.println(" Depositer Name: " + depositerName + " \t Age: " + depositerAge + " \t Principle: " + depositerPrinciple + " \t Rate of Interest: " + rateOfInterest + "\n\n");
   }
}

public class staticVariable {
    public static void main(String[] args){

     Depositer depositerFirst = new Depositer();
     depositerFirst.setDepositerDetails("Sameer Neupane", 19, 1900, 6.9);
     depositerFirst.showDepositerDetails();

     Depositer secondDepositer = new Depositer();
     secondDepositer.setDepositerDetails("Sijan Kaucha", 20, 39999, 7.6);
     secondDepositer.showDepositerDetails();

                                    // Static member variable is not destroyed so it updates the latest value of 7.6 rather than printing 6.9
     depositerFirst.showDepositerDetails();
    }
}
