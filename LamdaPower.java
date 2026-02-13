
interface Functional{
	int operation(int n, int pow);
}
public class LamdaPower{
public static void main(String[] args){
 
	Functional power = (a,b) -> Math.pow(a,b);
 
 
	System.out.println(power.operation(2,3));
	System.out.println(power.operation(6,3));
}
}
 
 

 
 

 
 

 
