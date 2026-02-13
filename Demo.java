import java.io.*;

interface TestInterface{
  final int n = 10;
void display();
}

class TestClass implements TestInterface{
 public void display(){

	System.out.println("interface");
}
}

class Demo{

	public static void main(String[] args){
	TestClass t  = new TestClass();
	t.display();
	System.out.println(t.n);
}
}