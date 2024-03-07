class Person{
    private String name, address, profession;
    private int salary;

  {
    name = "NULL";
    address = "NULL";
    profession = "NULL";
    salary = 0;
  }

    Person(){
        this.name = "Sameer Neupane";
        this.address = "Devdaha-3, Tatera";
        this.profession = "Unemployed";
        this.salary = 0;
    }

    Person(String name, String address, String profession, int salary){
        this.name = name;
        this.address = address;
        this.profession = profession;
        this.salary = salary;
}

    Person(String name){
        this.name = name;
    }

    Person(String name, String address, int salary){
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

void setData(String name, String address, String profession, int salary){
    this.name = name;
    this.address = address;
    this.profession = profession;
    this.salary = salary;
}

void showData(){
    System.out.println("Name: " + this.name + ", Address: " + this.address + ", Profession: " + this.profession + ", Salary: " + this.salary);
}
}

class Doctor extends Person{
    
    Doctor(){}

    Doctor(String name, String address ,int salary){
        super(name, address, "Doctor" ,salary);   
    }



}

public class constructorChaining {
    public static void main(String[] args){
    Doctor firstDoctor = new Doctor("Sameer Neupane", "Devdaha-3, Tatera", 400000);
    firstDoctor.showData();
    
    }
}
