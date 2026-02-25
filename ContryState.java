
 class Country {
String name;
void country(String name){
    this.name = name;
    
}
void display(){
    System.out.println("Country name is "+name);
}

class State extends Country{
    String stateName;
    void state(String stateName){
        this.stateName = stateName;
    }
    void display(){
        System.out.println("State name is "+stateName);
    }
}

class City extends State{
    String cityName;
    void city(String cityName){
        this.cityName = cityName;
    }
    void display(){
        System.out.println("City name is "+cityName);
    }
}
public class ContryState {
    public static void main(String[] args){
        City c1 = new City();
        c1.country("India");
        c1.state("Maharashtra");
        c1.city("Pune");
        c1.display();
    }
}
}
