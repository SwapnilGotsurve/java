class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        System.out.println("thread name: " + t1.getName() + " thread priority: " + t1.getPriority());
    }
}