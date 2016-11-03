/**
 * Created by tianhuihuang on 2016-11-02.
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                arrayList.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[arrayList.size()];
        int k = 0;
        for (Integer num : arrayList) {
            result[k++] = num;
        }
        return result;
    }
}