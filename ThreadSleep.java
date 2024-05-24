class Furniture extends Thread{
     public void run(){
        for(int i = 0; i < 100; i ++){
            System.out.println("This is a furniture class" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Table extends Thread{
    public void run(){
       for(int i = 0; i < 100; i ++){
           System.out.println("This is a table class" + i);
           try{
            Thread.sleep(10);
        }catch(InterruptedException e){
         e.printStackTrace();
        }
    }
}
}


public class ThreadSleep{
        public static void main(String[] args){
    
            Furniture bench = new Furniture();
            Table diningTable = new Table();

            bench.setPriority(Thread.MAX_PRIORITY);                      //thread in bench will have the maximum priority.

            bench.start();
            diningTable.start();
        }
    }
