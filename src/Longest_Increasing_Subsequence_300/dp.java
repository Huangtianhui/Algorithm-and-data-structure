package Longest_Increasing_Subsequence_300;

/**
 * Created by tianhuihuang on 2016-11-14.
 */
public class dp {
    /**
     * @param nums: The integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        int max=0;
        int[] result=new int[nums.length];
        //result[0]=1;
        for(int i=0;i<nums.length;i++){
            //dp initial is for every time update
            result[i]=1;
            //for (int j=0;j<=i;j++){
            //wrong for understanding
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    result[i]=result[i]>result[j]+1 ? result[i]: result[j]+1;
                }
            }
            //if(nums[i]>max){
            if(result[i]>max){
                //max=nums[i];
                //wrong for understanding
                max=result[i];
            }
        }
        return max;
    }
}
