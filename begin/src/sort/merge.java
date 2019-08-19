package sort;
/*
56. 合并区间
 *@Description
 *@Author  wx
 * @Date   2019-08-10-20:35
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {

    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i=0;
        while(i< intervals.length){
            int left=intervals[i][0];
            int right=intervals[i][1];

            while (i<intervals.length-1 && intervals[i+1][0]<=right){
                i++;
                right=Math.max(intervals[i][1],right);
            }
            res.add(new int[]{left,right});
            i++;
        }
         return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        merge merge=new merge();
        int[][] array = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result =merge.merge(array);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i][0]+","+result[i][1]);
        }

    }

}
