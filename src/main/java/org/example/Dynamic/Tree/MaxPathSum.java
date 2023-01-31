package org.example.Dynamic.Tree;

import org.example.BinaryTree.TreeNode;

public class MaxPathSum {

    private int helper(TreeNode root)
    {
        //base condition
        if(root == null)
            return 0;
        //hypothesis
        int left = helper(root.left);
        int right = helper(root.right);
        //induction
        int temp = Math.max(Math.max(left, right) + root.val, root.val);
        int ans = Math.max(temp , left + right + root.val);
        //int res = Math.max(ans, res);

        return temp;
    }
}
