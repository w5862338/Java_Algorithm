package bit;
/*
461. 汉明距离       求汉明距离
两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。

 *@Description
 *@Author  wx
 * @Date   2019-08-22-13:58
 */

public class hammingDistance {
    public int hammingDistance(int x, int y) {
          return Integer.bitCount(x^y);
    }

    public static void main(String[] args) {
        hammingDistance hammingDistance=new hammingDistance();
        System.out.println(hammingDistance.hammingDistance(1,4));
    }
}
