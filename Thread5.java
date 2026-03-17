class Thread5 {

    // synchronized method
    synchronized void test_fun(int n) {
        for (int i = 0; i < 5; i++) {
            System.out.println(n + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Thread5 obj = new Thread5();  // SAME OBJECT (important)

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.test_fun(10);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.test_fun(20);
            }
        });

        t1.start();
        t2.start();
    }
}