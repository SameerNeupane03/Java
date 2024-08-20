class GenericData<Data>{
Data data1;
public void setData(Data d){
    data1 = d;
}

public Data showData(){
    System.out.println(data1);
    return data1;
}
}

public class GenericClass {
    public static void main(String[] args){
    GenericData <Integer>firstData = new GenericData<Integer>();
    Integer i1 = 5;
    firstData.setData(i1);
    firstData.showData();

    GenericData <String>secondData = new GenericData<String>();
    String myName = "Sameer";
    secondData.setData(myName);
    secondData.showData();
    }
}
