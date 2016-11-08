package Permutations_46;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
//递归要写一下test case 比如这tmp.contains
    //不同题可以用这个模版不过要考虑test case
class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> result=new ArrayList<List<Integer>>();
        if(nums==null){
            return result;
        }
        if(nums.length==0){
            result.add(new ArrayList<Integer>());
            return result;
        }
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        helper(result,tmp,nums);
        return result;
    }
    private void helper(ArrayList<List<Integer>> result, ArrayList<Integer> tmp,int[] nums){
        if(tmp.size()==nums.length){
            result.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            //this part for wrong consideration not think of [0,0],[1,1],[0,1],[1,0]
            if(tmp.contains(nums[i])){
                continue;
            }
            tmp.add(nums[i]);
            helper(result,tmp,nums);
            tmp.remove(tmp.size()-1);
        }
    }
}

