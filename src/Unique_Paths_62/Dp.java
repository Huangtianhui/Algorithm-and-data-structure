package Unique_Paths_62;

/**
 * Created by tianhuihuang on 2016-11-08.
 */
public int uniquePaths(int m, int n) {
        // write your code here
        if(m<=0 || n<=0){
        return 0;
        }

        int[][] result=new int[m][n];

        //initial value should be given only for row and column
        // for (int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         tempresult[m][n]=1;
        //     }
        // }
        for(int i=0;i<n;i++){
        result[0][i]=1;
        }
        for(int i=0;i<m;i++){
        result[i][0]=1;
        }

        //int[] result=new int[m*n];
        //int index=0;
        for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
        // result[index]=tempresult[m-1][n]+tempresult[m][n-1];
        // index++;
        result[i][j]=result[i-1][j]+result[i][j-1];
        }
        }

        return result[m-1][n-1];
        }