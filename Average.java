//calcualte the total and average of student using arraylist 

import java.util.ArrayList;

class Average{
    public static void main(String args[]){
         ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(15);
    arr.add(20);
    arr.add(25);

    int total = 0;
    for (int i : arr) {
      System.out.println(i);
      total += i;
    }
    
    double avg = total / (arr.size() );
    System.out.println(avg);
    }
}