public SumFibo{
    public static void main(String[] args) {
        int n = 10; // Change this value to compute sum of first n Fibonacci numbers
        int sum = sumFibonacci(n);
        System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
    }

    public static int sumFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }

        return sum;
    }
}