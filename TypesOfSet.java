import java.util.*;
public class TypesOfSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3); 
        set.add(4);
        set.add(5);
        set.add(5);
        System.out.println("HashSet: " + set);

        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<Integer>();
        linkedSet.add(1);   
        linkedSet.add(2);
        linkedSet.add(3);
        linkedSet.add(4);
        linkedSet.add(4);

        System.out.println("LinkedHashSet: " + linkedSet);  
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(5); 
        treeSet.add(3);
        treeSet.add(1); 
        treeSet.add(4);
        treeSet.add(2); 
        

        System.out.println("TreeSet: " + treeSet);



    }
}
