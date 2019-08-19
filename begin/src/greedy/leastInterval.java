package greedy;
/*  任务调度器
   贪心算法解决这道题
 *@Description
 *@Author  wx
 * @Date   2019-08-07-21:06
 */

import org.omg.CORBA.MARSHAL;

import java.util.HashMap;
import java.util.Map;

public class leastInterval {

    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> hashMap=new HashMap<Character, Integer>();
        for (Character c :tasks){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else hashMap.put(c,1);
        }
        //获取最多字符的个数
        Integer max=0;
        for (Map.Entry<Character,Integer> entry : hashMap.entrySet()){
             if(entry.getValue()>max) max=entry.getValue();
        }

        //获取都是max字数的字符个数
        Integer count=0;
        for (Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            if(entry.getValue().equals(max)) count++;
        }

        return Math.max(((n+1)*(max-1)+count),tasks.length);
    }

    public static void main(String[] args) {
        leastInterval leastInterval=new leastInterval();
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(leastInterval.leastInterval(tasks,2));

    }

}
