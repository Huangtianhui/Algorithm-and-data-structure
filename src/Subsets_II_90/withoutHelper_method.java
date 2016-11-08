package Subsets_II_90;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
//虽然可以过，不过数据类型不一样
//this method only leetcode works, for no data type restrication and for lintcode with compiler error
public class Solution {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        addSubset(nums, 0, new ArrayList<Integer>());
        return res;
    }
    private void addSubset(int[] nums, int i, List<Integer> b) {
        res.add(b);
        for (int j = i; j < nums.length; j++) {
            List<Integer> c = new ArrayList<>(b);
            //这里不懂，那重复的数字怎么被加进来的,是因为重复的数字就不进行递归
            if (j == i || (j > i && nums[j] != nums[j-1])) {
                c.add(nums[j]);
                addSubset(nums, j+1, c);
            }
        }
    }
}