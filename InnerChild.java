 class GrandFather {
    void display(){
        System.out.println("I am GrandFather");
    }
}
 class Father extends GrandFather {
    void display(){
        System.out.println("I am Father");
    }
}
 class Child {

    void display(){
        System.out.println("I am Child");
    }
}
public class InnerChild {
public static void main(String[] args) {
    Child c = new Child();
    c.display();
    Father f = new Father();
    f.display();
    GrandFather g = new GrandFather();
    g.display();
}
}