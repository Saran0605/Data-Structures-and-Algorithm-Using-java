//Finding missing no in an array 
import java.util.*;
public class prg1 {
    public static int missing(int[] arr, int n){
        //Formula for finding sum of series
        int sum = n*(n+1)/2;
        //Finding total value of array
        int total = 0;
        for(int num:arr){
            total+=num;
        }
        //find value by subtracting sum of series value and total sum of array
        return sum-total;
    }
    public static void main(String[] args){
        //use scanner for input purposes
        int[] arr = {1,2,3,5,6};
        int n = 6;
        //calling the method for output
        int res = missing(arr,n);
        System.out.println(res);
    }
    
    
}

//OUTPUT : 4;
//TIME COMPLEXITY : O(n) -> one for loop for adding elements
