public class TypeConversion {
    public static void main(String[] args) {
        
        //converting int value to byte;
        int  convertNum = 258;
        byte convertedNum = (byte) convertNum;        //it will return 2 because, the maximum number it can store is 256
                                                      //numbers so after that will return the remainder: n % 256 = outputVal;
        
        //typecasting;
        int implicitlyTypeCast = 10;
        double typeCasted = implicitlyTypeCast;

        //Trying for Char to int;
        char myInitial = 'S';
        int storeMyInitial = (int) myInitial;   //it will return the UNICODE value;
        System.out.println("Int to Byte: " + convertedNum + "\nInt to Double implicitly type casted: " + typeCasted + "\n\nChar to Int: " + storeMyInitial);
    }
    
}
