public class wrapperClass {
    public static void main(String[] args){
    String myName = "33";
    int nameToNum = Integer.parseInt(myName);

    int oddNum = 3;
    Integer storeOdd = oddNum;
    System.out.println(nameToNum + storeOdd);
       //oddNum is premitive(int) data type and storeOdd is non-premitive(object) data type but we can convert premitive data type to non-premitive data type
    if(oddNum == storeOdd){
        System.out.println("True");
    }
    }
}
