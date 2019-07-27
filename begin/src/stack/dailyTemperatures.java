package stack;
/*
leetcode 中stack相关的题目
739. 每日温度
 *@Description
 *@Author  wx
 * @Date   2019-06-23-21:10
 */

import java.util.Stack;

public class dailyTemperatures {
    public static int[] dailyTemperatures(int[] T) {
        //https://blog.csdn.net/qq_17550379/article/details/86494645
        //详细解题思路
        int[] result = new int[T.length];
        Stack<Integer>  tmp= new Stack<>();
        for (int i=T.length-1;i>=0;i--){
            while(!tmp.isEmpty()&& T[i] >= T[tmp.peek()]) tmp.pop();
            result[i]= tmp.isEmpty()? 0 : tmp.peek()-i;
            tmp.push(i);
        }
        for(int i =0;i<T.length;i++)
        System.out.println(result[i]);
        return result;
    }

    public static void main(String[] args) {
        int[] T={73,74,75,71,69,72,76,73};

        dailyTemperatures(T);
    }

}
