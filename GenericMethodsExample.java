class TryGenericMethod{
     public <template>void showDetail(template []firstData){
        for(template t: firstData){                        // syntax of for each loop: for(DataType Variable: ArrayName)  :: Note: it can only be use in array.
            System.out.print(t + "  ");
        }
        
     }
}

public class GenericMethodsExample {
       public static void main(String []args){
       TryGenericMethod differentDataTypes = new TryGenericMethod();
       String carName[] = new String[]{"Honda","Hundai","Mahindra","Tata","Renault"};    // Generic method don't accept premitive values.  
       Integer carPrice[] = {4000000,3000000,2500000,2200000,3200000};                     // not using premitive value like int, char, float because Generic method do not accept premitive values. 
       differentDataTypes.showDetail(carName);
       System.out.println("\n");
       differentDataTypes.showDetail(carPrice);
       System.out.println("\n");
       }    
}
