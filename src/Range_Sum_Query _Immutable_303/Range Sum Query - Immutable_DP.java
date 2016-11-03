/**
 * Created by tianhuihuang on 2016-11-02.
 */
public class NumArray {
    int[] sums;
    
    public  NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for(int i = 1; i < sums.length; i++) //Note* start at 1
            sums[i] = sums[i - 1] + nums[i-1];
    }
    
    
    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
    
    // below is the same code is wrong beacause should use array symbol[] instead of () for method
    // int[] sums;
    
    // public NumArray(int[] nums) {
    //     sums=new int[nums.length+1];
    //     sums[0]=0;
    //     for (int i=1;i<sums.length;i++){
    //         sums[i]=sums[i-1]+nums[i-1];
    //     }
    // }
    
    // public int sumRange(int i, int j) {
    //     return sums(j+1)-sums(i);
    // }
    
}