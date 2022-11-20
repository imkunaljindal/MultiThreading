import javax.sound.sampled.Port;

class Portugal implements Runnable{

    @Override
   public void run(){
       for(int i=0;i<5;i++)
       {
           System.out.println("Ronaldo");
           try {
               Thread.sleep(1);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
   }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread p = new Thread(new Portugal());
        p.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("Messi");
            Thread.sleep(1);
        }
        System.out.println(p.isAlive());
    }
}