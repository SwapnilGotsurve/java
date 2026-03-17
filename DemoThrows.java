import java.io.*;
import java.util.*;

public class DemoThrows {

    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException{
      Scanner sc = new Scanner(System.in);
      int a , b ;
      int arr[]= {10,20,30};
      System.out.println("value of array " + arr[5]);
      
      System.out.println("enter value of a and b");
     a = sc.nextInt();
      b = sc.nextInt();
      float res = a /b ;
     System.out.println(res);

     
    
    }

    }