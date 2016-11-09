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
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int prev=1;
        //int cur=2;
        //cur is 1 means prev is the prev result and currently only one method possible
        int cur=1;
        int result=0;
        //while(cur<=n){
        for(int i=2;i<=n;i++){
            result=prev+cur;
            prev=cur;
            cur=result;
        }
        return result;
    }
}
