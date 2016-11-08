package Subsets_II_90;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> S) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<ArrayList<Integer>>();
        if ( S == null || S.size() == 0){
            return rst;
        }

        Collections.sort(S);
        ArrayList<Integer> list = new ArrayList<Integer>();
        helper(rst,list,S,0);
        return rst;
    }

    public void helper(ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> list,
                       ArrayList<Integer> S, int pos) {
        rst.add( new ArrayList(list));
        for ( int i = pos; i < S.size();i++){
            if ( i != pos && S.get(i) == S.get(i-1)){
                continue;
            }

            list.add(S.get(i));
            helper(rst,list,S,i+1);
            list.remove(list.size()-1);
        }
    }
}
