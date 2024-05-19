public class StringMethods {
    public static void main(String[] args) {
    String myName = new String("Sameer");
        
    System.out.println(myName.toUpperCase());

    System.out.println(myName.toLowerCase());


    int searchIndex = myName.indexOf("ame");                    //Sameer ~ame starts from index 1.
    System.out.println(searchIndex);

    searchIndex = myName.indexOf('e',3);                 //starts to search 'e' from position 3 and it gets at 3rd position
    System.out.println(searchIndex);

    String getSubString = myName.substring(2,5);
    System.out.println(getSubString);
     
    }
   
}
