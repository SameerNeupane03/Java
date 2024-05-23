
class Addition extends Thread{
    public void run(){
        int firstNum = 5, secondNum = 15, sum;

        sum = firstNum + secondNum;

        System.out.println("The sum of two numbers is " + sum);
    }
}

class Subtraction extends Thread{
    public void run(){
        int firstNum = 5, secondNum = 15, sub;

        sub = firstNum - secondNum;

        System.out.println("The subtraction in between two numbers is " + sub);
    }
}


public class ThreadsExample {
    public static void main(String[] args){
     Addition add = new Addition();
     Subtraction sub = new Subtraction();

     add.start();
     sub.start();
    }
    
}
