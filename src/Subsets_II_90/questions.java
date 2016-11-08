package Subsets_II_90;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
//如果函数自己调用自己不可以，因为需要记录下进行到的位置
class Solution {
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    ArrayList<Integer> tempresult=new ArrayList<Integer>();
    HashSet<ArrayList> result=new HashSet<Integer>();
    List<ArrayList> finalresult=new ArrayList<ArrayList>();
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        // write your code here

        if(nums==null || nums.length==0){
            return finalresult;
        }

        for(int i=0;i<nums.lengh;i++){
            tempresult.add(nums[i]);
            if(i<nums.length){
                result.add(tempresult);
                subsetsWithDup(nums[i]);
                tempresult.remove(nums[i]);
            }

        }


        while(ArrayList a:result){
            finalresul.add(a);
        }

        return finalresult;
    }


}
