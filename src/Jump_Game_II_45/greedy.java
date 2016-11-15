package Jump_Game_II_45;

/**
 * Created by tianhuihuang on 2016-11-14.
 */
public class greedy {

        /**
         * @param A: A list of lists of integers
         * @return: An integer
         */
        public int jump(int[] A) {
            // write your code here
            if(A==null || A.length==0){
                //return 0;
                return -1;
            }
            int start=0,end=0,jump=0;
            //int far=0;
            //initial wrong for every time the far will update
            while(end<A.length-1){
                jump++;
                int far=end;
                //for(int i=start;i<A.length-1;i++){
                for(int i=start;i<=A.length-1;i++){
                    if(A[i]+i>far){
                        far=A[i]+i;
                    }
                }
                start=end+1;
                end=far;
            }
            return jump;
        }


}
