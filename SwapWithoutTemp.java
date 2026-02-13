//program to swap two numbers without using third variable
class SwapWithoutTemp{
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        
        a = a+b;
        b = a-b;  //30 - 20 = 10
        a = a-b; // 30-10 =20

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);


    }
}