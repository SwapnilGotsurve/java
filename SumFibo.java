public class SumFibo{
    public static void main(String[] args) {
        int n = 6;
        int sum = sumFibonacci(n);
        System.out.println("Sum of first " + n + " Fibonacci numbers is: " + sum);
    }

    public static int sumFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        int sum = a + b;

        for (int i = 2; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }

        return sum;
    }
}