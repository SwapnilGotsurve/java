// import java.io.*
// import java.util.*;;

class Exception{
    public static void main(String[] args) {
            float  a = 5;
        float b =0 ;

       try{
     
        float c = a /b ;
       }
       catch(ArithmeticException a){
        System.out.println("division error");
       }
       finally{
        System.out.println("finally block");
       }

    }
}