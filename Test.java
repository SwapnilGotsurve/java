
 
interface Functional{
	int operation(int a, int b);
}
public class Test{
	public static void main(String[] args){
 
	Functional add = (a,b) -> a+b;
	Functional mul = (a,b) -> a*b;
 
	System.out.println(add.operation(6,3));
 
 
	System.out.println(mul.operation(6,3));
}
}
 