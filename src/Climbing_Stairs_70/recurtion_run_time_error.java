package Climbing_Stairs_70;

/**
 * Created by tianhuihuang on 2016-11-08.
 */
public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(n==3){
            return 3;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
