package greedy;
/*  身高重建   贪心算法的题目   也可以使用动态规划
 *@Description
 *@Author  wx
 * @Date   2019-07-26-21:55
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reconstructQueue {

    //详细题解：https://www.jianshu.com/p/3eee89a6417a
    //也是一种贪心算法吧 先排序确定大体的位置 再根据不同细节进行调整

    public int[][] reconstructQueue(int[][] people) {
        if(people ==null || people.length==0 || people[0].length==0)
            return new int[0][0];
        Arrays.sort(people,(a,b)->(a[0]==b[0]?a[1]-b[1]:b[0]-a[0]));
        List<int[]> list =new ArrayList<>(6);
        for(int[] p:people){
            list.add(p[1],p);
        }
        return  list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] a={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        reconstructQueue reconstructQueue=new reconstructQueue();
        a=reconstructQueue.reconstructQueue(a);
        for (int[] b:a){
            System.out.println("["+b[0]+","+b[1]+"]");
        }

    }

}
