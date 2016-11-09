package Search_Insert_Position_35;

/**
 * Created by tianhuihuang on 2016-11-08.
 */
public class Solution {
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    //corner test case for the array boundary equal both for beginning and ending
    //also write test case for return i or i+1
    // for array most situatio pass but for run time error so consider about BS
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A==null || A.length==0){
            return 0;
        }
        if(A[0]>=target){
            return 0;
        }
        for(int i=0;i<A.length-1;i++){
            if(A[i]<target && A[i+1]>target){
                return i+1;
            }
            if(A[A.length-1]==target){
                return A.length-1;
            }
            // if(i==A.length-1){
            //     return A.length;
            // }
        }
        return A.length;
    }
}
