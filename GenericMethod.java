class GenericExample{
    public <GenericDataType> void displayDifferentDataTypes(GenericDataType []G){
      for(int i = 0; i < G.length; i ++){
        System.out.println("Lists: " + (i+1) +" " + G[i]);
      }
    } 
}

public class GenericMethod {
    public static void main(String []args){
        String nameLists[] = new String[]{"Sameer", "Sijan", "Rohit", "Sunil", "Manish"};
        GenericExample firstExample = new GenericExample();
        firstExample.displayDifferentDataTypes(nameLists);
    }
}
