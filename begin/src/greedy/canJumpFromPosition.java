package greedy;
/* 跳跃游戏   贪心算法的题目   也可以使用动态规划
 *@Description
 *@Author  wx
 * @Date   2019-07-10-16:17
 */

public class canJumpFromPosition {
    enum  State{
        GOOD,BAD,UNKNOWN
    }
    State index[]={State.UNKNOWN,State.UNKNOWN,State.UNKNOWN,State.UNKNOWN,State.GOOD};

    //第一种方法相当于 递归着的全部遍历一遍（回溯法）
    public boolean JumpFromPosition1(int position,int[]  nums){
        if(position == nums.length-1)  return true;

        int  nextMaxPosition= Math.min(position+nums[position],nums.length-1);
        for(int nextPosition = position+1; nextPosition <= nextMaxPosition; nextPosition++){
            if(JumpFromPosition1(nextPosition,nums))  return true;
        }
        return false;
    }

    //第二种方法其实只是在第一种方法的基础上改良了一下  加上了一个标记点
    //自顶向下的动态规划算法  相当于回溯法的改良
    public  boolean JumpFromPosition2(int position,int[]  nums){
        if(index[position]!= State.UNKNOWN)  return index[position] == State.GOOD?true:false;

        int  nextMaxPosition= Math.min(position+nums[position],nums.length-1);
        for(int nextPosition=position+1;nextPosition <= nextMaxPosition;nextPosition++){
            if(JumpFromPosition2(nextPosition,nums)) {
                index[position]=State.GOOD;
                return true;
            }
        }
        index[position]=State.BAD;
        return false;
    }

    public  boolean JumpFromPosition3(int position,int[]  nums){

        return false;
    }



    public  boolean canJump(int[] nums) {
       return JumpFromPosition2(0,nums);
    }

    public static void main(String[] args) {
        int nums[]={2,3,1,1,4};
        canJumpFromPosition canJumpFromPosition=new canJumpFromPosition();
        System.out.println(canJumpFromPosition.canJump(nums));
    }
}
