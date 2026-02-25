import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args){
        ArrayList<Integer> arr =new  ArrayList<>();
        arr.add(12);
        arr.add(14);
        arr.add(16);
        arr.add(17);
        arr.set(0,13);
        arr.add(4, 5);
        arr.remove(2);
        System.out.println(arr.get(1));
        // System.out.println(arr.(1));
        System.out.print(arr);
        System.out.print(arr.size());
        System.out.println(arr.indexOf(17));
        System.out.println(arr.isEmpty());
    }
}
