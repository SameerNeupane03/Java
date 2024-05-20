import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        int num1;
        int num2;
        int divisible;
        Scanner inputNumber = new Scanner(System.in);

        try{
            System.out.println("Enter first number: ");
            num1 = inputNumber.nextInt();

            System.out.println("Enter second number");
            num2 = inputNumber.nextInt();
               
            divisible = num1 / num2;

            System.out.println("The division of two number is: " + divisible);

        }catch(ArithmeticException numException){
            System.out.println("Error: Cannot divide numerator by 0");
        }
        catch(InputMismatchException inputException){
            System.out.println("Error: Only allowed integers");
        }
        catch(Exception e){
            System.out.println("Error: Something is wrong in this program");
        }

    }
}
