/**
 * Created by tianhuihuang on 2016-11-02.
 */
public class NumArray {
    
    int[] nums;
    int[] numSum;
    
    public NumArray(int[] nums) {
        //仔细体会第一句的重要性，别的方法调用他的时候值容易发生改变
        this.nums = nums;
        numSum = new int[nums.length + 1];
        numSum[0] = 0;
        for(int i = 1; i < numSum.length; i++){
            numSum[i] = numSum[i - 1] + nums[i - 1];
        }
    }
    
    public int sumRange(int i, int j) {
        if(i < 0 || j >= nums.length){
            return 0;
        }
        
        return numSum[j + 1] - numSum[i];
    }
    
    
}