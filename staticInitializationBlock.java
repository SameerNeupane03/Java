class Person{
     private String personName, personAddress;
     private int personAge;
     private static int personEyes;

     static{
        personEyes = 2;
     }

    Person(){
        personName = "Sijan Kaucha";
        personAddress = "Devdaha-8, Pakari";
        personAge = 20;
    }

    public void showPersonDetails(){
        System.out.println("Name " + personName + ", Address " + personAddress + ", Age " + personAge + ", Eyes " + personEyes);
    }
}

public class staticInitializationBlock {
    public static void main(String[] args){
     Person myFriend = new Person();
     myFriend.showPersonDetails();
    }
}
