
 
 class Class1{
 public int add(int a, int b , int c){
   return a+b;
}
}
 class Class2 extends Class1	{
 public double add(double a, double b){
   return a+b;
}
}
 
public class MethodOverloading {
	public static void main(String[] args){
 
Class2 obj1 = new Class2();
 
System.out.println(obj1.add(5,1));
System.out.println(obj1.add(5.1,1.2));
System.out.println(obj1.add(5,5,5));
}
}