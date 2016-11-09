package Minimum_Path_Sum_64;

/**
 * Created by tianhuihuang on 2016-11-08.
 */
public class Solution {
    /**
     * @param grid: a list of lists of integers.
     * @return: An integer, minimizes the sum of all numbers along its path
     */
    public int minPathSum(int[][] grid) {
        // write your code here
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int row=grid.length;
        int colum=grid[0].length;

        int[][] result=new int[row][colum];
        //this sentence is missing should clear every step and also clear about initial step
        result[0][0] = grid[0][0];
        //initial should begin with 1 instead of 0
        for(int i=1;i<row;i++){
            result[i][0]=result[i-1][0]+grid[i][0];
        }
        for(int i=1;i<colum;i++){
            result[0][i]=result[0][i-1]+grid[0][i];
        }
        for (int i=1;i<row;i++){
            for (int j=1;j<colum;j++){
                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
            }
        }
        return result[row-1][colum-1];
    }
}

