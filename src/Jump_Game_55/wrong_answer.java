public class Solution {
    /**
     * @param A: A list of integers
     * @return: The boolean answer
     */
    //之所以错的原因是因为不是确定的步数而是说可能性所以错误的算法
    public boolean canJump(int[] A) {
        // wirte your code here
        int index=0,pos=0;
        while(index<A.length){
            if(A[index]==0){
                return false;
            }
            if(A[index]==A.length-1){
                return true;
            }
            if(A[index]>=A.length-1){
                return false;
            }
            index+=A[index];
        }
        return true;
    }
}
