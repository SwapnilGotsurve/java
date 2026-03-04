public class Thread4 extends Thread {
 @Override
 public void run() {
     for(int i=0; i<5; i++){
         System.out.println("Thread is running: " + getName());
         System.out.println(Thread.currentThread().getName());
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
            System.out.println("Thread is interrupted: " + getName());
             
         }
     }
 }
    public static void main(String[] args) {
        Thread4 t1 = new Thread4();
        Thread4 t2 = new Thread4();
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
    
}
