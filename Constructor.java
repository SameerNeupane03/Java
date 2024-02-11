import java.util.Scanner;

public class Constructor {
    private String myName;
    private int myAge;
    private String myQualification;

    public Constructor(){}

    public Constructor(String MyName, int MyAge, String MyQualification){
        myName = MyName;
        myAge = MyAge;
        myQualification = MyQualification;
    }

    public void setMyDetails(){
    Scanner stringName = new Scanner(System.in);
    System.out.println("Enter your name: ");
    myName = stringName.nextLine();
    //Intensionally I have written my qualification at 2nd because writing it at last will create a problem
    //:- it assumes that after nextInt input is done so I cannot write nextLine after nextInt
    System.out.println("Enter your qualification: ");
    myQualification = stringName.nextLine();
    System.out.println("Enter your age: ");
    myAge = stringName.nextInt();

    stringName.close();
    }

    public void showMyDetails(){
        System.out.println("My name is " + myName + ", My age is " + myAge + " and my qualification is " + myQualification);
    }
    public static void main(String[] args){
        Constructor constructorCheck = new Constructor("Sameer", 19, "+2 passout");
        constructorCheck.showMyDetails();
        Constructor c2 = new Constructor();
        c2.setMyDetails();
        c2.showMyDetails();
    }
}
