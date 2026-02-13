public class CountVowels {
    public static void main(String[] args) {
        String str = "Swapnil";
        int count = 0;
        int consonantCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }else{
                consonantCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
        System.out.println("Number of consonants in the string: " + consonantCount);
    }
}
