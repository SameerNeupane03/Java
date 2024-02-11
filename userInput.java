import java.util.Scanner;

class userDetail{
    String name;
    int age;
    String address;

    public void takeUserInput(){
        Scanner nameObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = nameObj.nextLine();
        Scanner nameObj2 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = nameObj2.nextInt();
        System.out.println("Enter your address: ");
        address = nameObj.nextLine();
        System.out.println("Your name is: " + name +" and age is: " + age + " and you live in " + address + "\n");
        nameObj.close();
        nameObj2.close();
    }
}

public class userInput {
   public static void main(String[] args) {
    userDetail newObj = new userDetail();
    newObj.takeUserInput();
   } 
}
