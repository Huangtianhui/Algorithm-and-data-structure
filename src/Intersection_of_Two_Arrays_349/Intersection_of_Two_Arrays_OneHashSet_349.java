/**
 * Created by tianhuihuang on 2016-11-02.
 */
// 始终对于自己的有问题，答案没有问题，看上去一样

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //善于利用hashset remove 可以减少开支一个hashset
        List<Integer> results=new ArrayList<Integer>();
        int size=results.size();
        int[] result=new int[size];
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0){
            return result;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            if(hs.contains(i)){
                results.add(i);
                hs.remove(i);
            }
        }
        
        
        int ind=0;
        for(int i:results){
            result[ind++]=i;
        }
        
        // for(int i=0;i<results.size();i++){
        //     result[i]=results.get(i);
        // }
        
        return result;
        
        // HashSet<Integer> hs = new HashSet<>();
        // int[] res;
        // ArrayList<Integer> temp = new ArrayList<>();
        
        // for(int i:nums1)
        //     hs.add(i);
        
        // for(int i:nums2)
        // {
        //     if(hs.contains(i))
        //     {
        //         temp.add(i);
        //         hs.remove(i);
        //     }
        // }
        // int size = temp.size();
        
        // res = new int[size];
        // int ind = 0;
        // for(int i : temp)
        //     res[ind++] = i;
        // return res;
    }
}

