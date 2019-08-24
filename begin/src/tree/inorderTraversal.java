package tree;
/*
  94. 二叉树的中序遍历
 *@Description
 *@Author  wx
 * @Date   2019-08-24-14:41
 */

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        //递归 中序遍历
        helper(root,result);

        return result;
    }

    public  void  helper(TreeNode root, List<Integer> result){
        if(root != null){
            if(root.left != null){
                helper(root.left,result);
            }
            result.add(root.val);
            if (root.right != null){
                helper(root.right,result);
            }

        }
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);

        treeNode.left=treeNode3;
        treeNode.right=treeNode2;

        inorderTraversal inorderTraversal=new inorderTraversal();
        List<Integer> res=new ArrayList<Integer>();
      res=  inorderTraversal.inorderTraversal(treeNode);

      for (Integer i:res){
          System.out.println(i);
      }

    }

}
