class Vehicle implements Runnable{
    public void run(){
        for(int i = 0; i < 20; i ++){
            System.out.println("Vehicle" + i);
        }
    }
}

class Car implements Runnable{
    public void run(){
        for(int i = 0; i < 20; i++){
            System.out.println("Car" + i);
        }
    }
}

public class ThreadInRunnableInterface {
    public static void main(String[] args){
     Vehicle truck = new Vehicle();
     Car toyota = new Car();

     Thread firstThread = new Thread(truck);
     Thread secondThread = new Thread(toyota);
     firstThread.start();                                 //first and second thread will execute at the same time
     secondThread.start();
    }
    
}
