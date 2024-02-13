class Electronics{
    private final String name, display;
    private int price;

    {
         name = "Television";
         display = "44 inch";
         price = 60_000;
    }
/* 
  // I cannot initialize the final instance variables with function because they are already initialized with initialization block
 //  So it will gives an error 

    void setElectronics(String name, String display, int price){
        this.name = name;
        this.display = display;
        this.price = price;
    }
    */

   final void showDetails(){
        System.out.println("Electronics Name " + name + ", Display " + display + ", Price " + price);
    }
}

class Mobile extends Electronics{
    private String mobileName, mobileDisplay;
    private int mobilePrice;

    {
        mobileName = "Null";
        mobileDisplay = "Null";
        mobilePrice = 0;
    }

    void setMobileDetails(String mobileName, String mobileDisplay, int mobilePrice){
        this.mobileName = mobileName;
        this.mobileDisplay = mobileDisplay;
        this.mobilePrice = mobilePrice;
    }

    void showMobileDetails(){
        System.out.println("Mobile Name " + mobileName + ", Display " + mobileDisplay + ", Price " + mobilePrice);
    }

    /* 
    //It will gives an error because it is final method in parent class
    void showDetails(){
        System.out.println("Mobile Name " + mobileName + ", Display " + mobileDisplay + ", Price " + mobilePrice);
    }*/
}

public class FinalKeyword {
    public static void main(String[] args){
     Mobile mobile3 = new Mobile();
     mobile3.showMobileDetails();
    }
}
