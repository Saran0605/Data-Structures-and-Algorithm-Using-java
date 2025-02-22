//linear searching algorithm
import java.util.*;
public class prg11 {
    public static void main(String[] args){
        int[] arr1 = {11,45,67,34,56,87,98};
        int target = 1;
        int res = linear(arr1,target);
        if(res!=-1){
            System.out.println("Match Found"+" "+res);

        }
        else{
            System.out.println("no element found");
        }

    }
    public static int linear(int[] arr1,int target){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                return i;
            }
            
        }
        return -1;
    }
    
}

//time complexity - O(n)
//space complexity - O(1)
