package Singleton_lintcode;

/**
 * Created by tianhuihuang on 2016-11-07.
 */
// 两个错误原因，已经在备注里面标注出来
class Solution {
    /**
     * @return: The same instance of this class every time
     */
    //public static instance=null;
    public static Solution instance=null;
    public static Solution getInstance() {
        // write your code here
        if(instance==null){
            //return new Solution();
            instance=new Solution();
        }
        return instance;
    }
};
