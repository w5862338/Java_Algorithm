package stack;
/*
20. 有效的括号
题目比较简单
判断一下 先后压入栈中的元素是否正常配对
 *@Description
 *@Author  wx
 * @Date   2019-06-23-21:44
 */

import java.util.Stack;

public class isValid {

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        //判断是否为左边的符号 如果是则存入右边符号
        //如果判断为右边服务则弹出栈顶元素 如果栈顶元素不是该元素则直接报错
        for (char c : s.toCharArray()){
           if(c =='(')
               stack.push(')');
           else if (c=='{')
               stack.push('}');
           else if (c == '[')
               stack.push(']');
           else if (stack.isEmpty() || stack.pop()!= c)
               return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
