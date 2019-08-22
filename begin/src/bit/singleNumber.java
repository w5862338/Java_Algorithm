package bit;
/*
   136. 只出现一次的数字
   对所有数据取亦或操作，剩下来就是只出现过一次的数据

如果我们对 0 和二进制位做 XOR 运算，得到的仍然是这个二进制位
a \oplus 0 = aa⊕0=a
如果我们对相同的二进制位做 XOR 运算，返回的结果是 0
a \oplus a = 0a⊕a=0
XOR 满足交换律和结合律
a \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b

作者：LeetCode
链接：https://leetcode-cn.com/problems/single-number/solution/zhi-chu-xian-yi-ci-de-shu-zi-by-leetcode/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

 *@Description
 *@Author  wx
 * @Date   2019-08-22-13:30
 */

public class singleNumber {

    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for (int i=1;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        singleNumber singleNumber=new singleNumber();
        int[] nums={2,2,3,3,1};
        System.out.println(singleNumber.singleNumber(nums));
    }
}
