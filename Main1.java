
abstract class Shape{
	abstract void draw();
}
 
class Circle extends Shape{
	public void draw(){
	System.out.println("shape is circle");
	}
}	
 
public class Main1{
	public static void main(String[] args){
 
	Circle c1 = new Circle();
	c1.draw();
}
}