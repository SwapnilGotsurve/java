import java.util.Arrays;

class SecondLargerstNum{
    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,8,6};
       Arrays.sort(arr);
        int large = arr[0];
        int secLarge = arr[0];

       for(int i=0;i<arr.length;i++){
        if(large < arr[i]){
            large = arr[i];
               
        }
    

   }
      for(int i=0;i<arr.length;i++){
      
        if(arr[i]!= large && arr[i]>secLarge){
            secLarge = arr[i];
        }

   }


   System.out.println(secLarge); 
   System.out.println(large); 
}
    
    }