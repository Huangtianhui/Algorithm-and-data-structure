/**
 * Created by tianhuihuang on 2016-11-02.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<Integer>();
        HashSet<Integer> hs2=new HashSet<Integer>();
        
        for(int i=0;i<nums1.length;i++){
            hs1.add(nums1[i]);
        }
        for(int a:nums2){
            if(hs1.contains(a)){
                hs2.add(a);
            }
        }
        int[] res=new int[hs2.size()];
        int i=0;
        for(int a:hs2){
            res[i++]=a;
        }
        return res;
    }
    
}