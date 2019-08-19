package bit;
/* 78 子集  使用位运算 解决子集的问题

https://blog.csdn.net/gh6267/article/details/88116764

 *@Description
 *@Author  wx
 * @Date   2019-08-18-20:19
 */

import java.util.ArrayList;
import java.util.List;

public class subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        int size = nums.length;
        int size2=1<<size;  //1 左移size位
        for (int i = 0; i < (size2); i++) {
            List<Integer> ax = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) != 0) {
                    ax.add(nums[j]);
                }
            }
            list.add(ax);
        }

        return list;

    }

    public static void main(String[] args) {
       int[]  a={1,2,3};
        subsets subsets=new subsets();
        subsets.subsets(a);
    }

}
