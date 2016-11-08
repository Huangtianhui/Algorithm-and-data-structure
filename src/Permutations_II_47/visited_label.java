package Permutations_II_47;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of unique permutations.
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // Write your code here
        ArrayList<List<Integer>> results = new ArrayList<List<Integer>>();
        if(nums==null){
            return results;
        }
        if(nums.length==0){
            results.add(new ArrayList<Integer>());
            return results;
        }
        Arrays.sort(nums);
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        int[] visited=new int[nums.length];
        for(int i=0;i<visited.length;i++){
            visited[i]=0;
        }
        helper(results,tmp,visited,nums);
        return results;
    }

    private void helper(ArrayList<List<Integer>> result, ArrayList<Integer> tmp,
                        int[] visited, int[] nums){
        if(tmp.size()==nums.length){
            result.add(new ArrayList<Integer>(tmp));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(visited[i]==1 || (i!=0 && nums[i]==nums[i-1]&& visited[i-1]==0)){
                continue;
            }
            visited[i]=1;
            tmp.add(nums[i]);
            helper(result,tmp,visited,nums);
            tmp.remove(tmp.size()-1);
            visited[i]=0;
        }



    }
}



