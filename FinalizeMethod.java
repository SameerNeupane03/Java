//Finalize Method is used to clean up the garbage value, like an unreferenced object.

class Addition{
    private int firstNum, secondNum;
     
    public void setNum(int firstNum, int secondNum){
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int sumTwoNum(){
      return (firstNum + secondNum);
    }

    public void displaySum(){
        System.out.println("The sum of two numbers is " + sumTwoNum());
    }

   // protected void finalize() {
   //     System.out.println("We're good to go.");
   // }

    public void cleanup() {
       System.out.println("Cleaning up the unnecessary garbages.");
    }
}

public class FinalizeMethod {
    public static void main(String[] args){
  
     Addition add = new Addition();
     add.setNum(5,22);
     add.displaySum();

     System.out.println("\n\n\n");
     add.cleanup();

     add = null;                               //we cannot access new Addition() object but it is consuming the space
     add.displaySum();                         //so we have to clear destroy the object using finalize method.
    }
}
