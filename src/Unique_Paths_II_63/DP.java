package Unique_Paths_II_63;

/**
 * Created by tianhuihuang on 2016-11-08.
 */
public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here

        int row=obstacleGrid.length;
        int colum=obstacleGrid[0].length;
        if(row<=0 || colum<=0){
            return 0;
        }
        int[][] result=new int[row][colum];
        //change for the initial part
        for (int i=0;i<row;i++){
            if(obstacleGrid[i][0]!=1){
                result[i][0]=1;
            }else{
                break;
            }

        }
        for (int i=0;i<colum;i++){
            if(obstacleGrid[0][i]!=1){
                result[0][i]=1;
            }else{
                break;
            }
        }
        for (int i=1;i<row;i++){
            for(int j=1;j<colum;j++){
                if(obstacleGrid[i][j]!=1){
                    result[i][j]=result[i-1][j]+result[i][j-1];
                }else{
                    //change the logic part following if else statement
                    result[i][j]=0;
                }

            }
        }
        return result[row-1][colum-1];
    }
}