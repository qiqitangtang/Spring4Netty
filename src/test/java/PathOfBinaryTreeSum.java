import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

/**
 * @Auhtor: tangqi@otasim.com
 * @Description:
 * @Date: Create in 15:11 2017/4/28
 * @Modified By:
 */
public class PathOfBinaryTreeSum {

    /**
     * @param root the root of binary tree
     * @param target an integer
     * @return all valid paths
     */
    public static List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
        Stack stack = new Stack();
        List list = Lists.newArrayList();
        List listsum = Lists.newArrayList();
        while (root != null){
            target = target - root.val;
            if (target > 0){
                listsum.add(root.val);
                if(target >= root.right.val){
                    stack.push(root.right);
                }
                if (target >= root.left.val){
                    root = root.left;
                }
            }else if (target == 0 ){
                listsum.add(root.val);
                list.add(listsum);
                break;
            }

            if (stack != null){

            }
        }



        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        final TreeNode left1 = new TreeNode(2);
        TreeNode left11 = new TreeNode(2);
        TreeNode left1right1 = new TreeNode(3);
        TreeNode right = new TreeNode(4);
        root.left = left1;
        root.right = right;
        left1.left = left11;
        left1.right = left1right1;

        List list = binaryTreePathSum(root, 5);

    }

}

class TreeNode {
    public int val;
    public TreeNode left, right;
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}