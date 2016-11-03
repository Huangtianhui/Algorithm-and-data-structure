/**
 * Created by tianhuihuang on 2016-11-02.
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null || nums2==null){
            return null;
        }
        HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }else{
                hm.put(nums1[i],1);
            }
        }
        ArrayList<Integer> resultArrayList=new ArrayList<Integer>();
        for (int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && !resultArrayList.contains(nums2[i])){
                resultArrayList.add(nums2[i]);
            }
        }
        int size=resultArrayList.size();
        int[] result=new int[size];
        int index=0;
        for (int i:resultArrayList){
            result[index++]=i;
        }
        
        return result;
    }
    
    
    // public int[] intersection(int[] nums1, int[] nums2) {
    //     if (nums1 == null || nums2 == null) {
    //         return null;
    //     }
    
    //     HashSet<Integer> hash = new HashSet<>();
    //     for (int i = 0; i < nums1.length; i++) {
    //         hash.add(nums1[i]);
    //     }
    
    //     HashSet<Integer> resultHash = new HashSet<>();
    //     for (int i = 0; i < nums2.length; i++) {
    //         if (hash.contains(nums2[i]) && !resultHash.contains(nums2[i])) {
    //             resultHash.add(nums2[i]);
    //         }
    //     }
    
    //     int size = resultHash.size();
    //     int[] result = new int[size];
    //     int index = 0;
    //     for (Integer num : resultHash) {
    //         result[index++] = num;
    //     }
    
    //     return result;
    // }
    
}