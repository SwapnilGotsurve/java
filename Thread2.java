class Thread2 extends Thread {
    public void run(){
        System.out.println("thread is running");
        System.out.println("thread name: " + getName() + " thread priority: " + getPriority());
    }
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.start();
    }    
}
