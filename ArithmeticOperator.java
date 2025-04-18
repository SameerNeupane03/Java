public class ArithmeticOperator {
    public static void main(String[] args){
        //There are many Arithmetic operators in Java like: +, -, *, /, % etc.

        int firstNum = 4;
        int secondNum = 6;

        //adding two numbers using + operator;
        int addNum = firstNum + secondNum;

        System.out.println(addNum);

        //it first increment the number and assign it to preIncrement;
        int preIncrement = ++addNum;

        System.out.println(preIncrement);

        //it first assign the number and increment the value, so the value in postIncrement variable will be same as secondNum;
        int postIncrement = secondNum++;
        //now secondNum variable value incremented by 1;
        int newNum = secondNum;
        System.out.println("\n Assigning the post increment value of second number in newNum variable: " + newNum);
        System.out.println(postIncrement);
    }
    
}
