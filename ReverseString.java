import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        String str = "swapnil";
        // System.out.print(str);
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
    
}
