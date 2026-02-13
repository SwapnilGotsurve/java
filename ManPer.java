
 
class Person{
	String name = "swapnil";
	int age = 20;
 
}
class Manager extends Person{
public void fun1(){
	System.out.println(this.name);
	System.out.println(this.age);
}
}
 
public class ManPer{
	 public static void main(String[] args){
Manager m1 = new Manager();
 
m1.fun1();
}
}