//binary search using loops
public class prg12 {
    public static void main(String[] args){
        int [] arr1 = {1,2,3,4,5,6,7,8};
        int target = 2;
        int res = binary(arr1,target);
        if(res!=-1){
            System.out.println("match found"+res);
        }
        else{
            System.out.println("no match found");
        }
    }
    public static int binary(int [] arr1,int target){
        int left = 0;int right = arr1.length-1; int mid = 0;
        while(left<right){
            mid = left+(right-left)/2;
            if(arr1[mid]==target){
                return mid;
            }
            else if(arr1[mid]>target){
                right = mid-1;
            }
            else if(arr1[mid]<target){
                left = mid+1;
            }
        }
        return -1;
}
    
}
//time complexity - O(Log n)
//space complexity - O(1)
