
interface Functional{
	int operation(int a, int b);
}
public class PowerUsingUserFunctionalInterface{
public static void main(String[] args){
 
	Functional power = (a,b) ->{
		for(int i=1;i<b;i++){
			a = a*a;


		}
		return a;

	};
 
 
	System.out.println(power.operation(2,3));
	System.out.println(power.operation(6,3));
}
}
 
 

 
 

 
 

 
