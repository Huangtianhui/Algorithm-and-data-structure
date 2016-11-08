package Subsets_78;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(nums==null || nums.length==0){
            return result;
        }
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(result,tmp,nums,0);
        return result;

    }
    public void helper(ArrayList<ArrayList<Integer>> result,
                       ArrayList<Integer> tmp, int[] nums, int pos){
        //result.add(tmp);
        result.add(new ArrayList(tmp));
        for (int i=pos;i<nums.length;i++){
            tmp.add(nums[i]);
            helper(result,tmp,nums,i+1);
            tmp.remove(tmp.size()-1);
        }

    }
}
