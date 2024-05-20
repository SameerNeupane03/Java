import java.util.Scanner;


public class ExplicitThrow {
    public static void main(String[] args){
    int currentBalance = 5000;
    int withdrawlAmount;
    Scanner inputObj = new Scanner(System.in);
    System.out.println("Enter the amount you want to withdraw: ");

    withdrawlAmount = inputObj.nextInt();

    try{
     if(currentBalance < withdrawlAmount){
     throw new ArithmeticException("Insufficient Balance in your account");
     }
     currentBalance = currentBalance - withdrawlAmount;
     System.out.println("Remaining balance: " + currentBalance);
    }catch(ArithmeticException a){
      System.out.println("Error: " + a.getMessage());
    }

    System.out.println("Program continue.....");
}
}
