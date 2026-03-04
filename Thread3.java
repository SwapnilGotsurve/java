public class Thread3 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
    t1.setName("thread 1");
    t2.setName("thread 2");
    t1.start();
    t2.start();
    }
    
}
