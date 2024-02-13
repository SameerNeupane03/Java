class Person{
    private String personName;
    private int personAge;

    Person(){
        personName = "Sameer Neupane";
        personAge = 19;
        System.out.println("Super class constructor");
    }

    Person(String personName, int personAge){
        this.personName = personName;
        this.personAge = personAge;
    }

    public void setPersonDetails(String personName, int personAge){
        this.personName = personName;
        this.personAge = personAge;
    }

    public void showDetails(){
        System.out.println("Name " + personName + "\t Age " + personAge);
    }
}

class Student extends Person{
    private String studentName;
    private int studentAge;

    Student(){
        studentName = "Bishal Chaudhary";
        studentAge = 19;
    }

    Student(String studentName, int studentAge){
        Super(String studentName, int studentAge);
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void setStudentDetails(String studentName, int studentAge){
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public void showDetails(){
        System.out.println("Name " + studentName + "\t Age " + studentAge);
    }
}

public class SuperKeyword {
    public static void main(String[] args){
     Student firstStudent = new Student();
     firstStudent.showDetails();
    }
}
