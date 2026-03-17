public class ZeroDivisionException {
    public static void main(String ars[]) {

        // First Exception
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Zero division exception error");
        }

        // Second Exception
        try {
            int[] arr = {2,3,4};
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }

        finally {
            System.out.println("finally block");
        }
    }
}