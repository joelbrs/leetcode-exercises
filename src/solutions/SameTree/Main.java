package solutions.SameTree;

import structures.trees.TreeNode;

public class Main {
    public static void main(String[] args) {
        //p = [1,2,1], q = [1,1,2]
        TreeNode t1 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode t2 = new TreeNode(1,new TreeNode(1),new TreeNode(2));

        System.out.println(Solution.isSameTree(t1, t2));
    }
}

class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (q == null && p != null)) {
            return false;
        }

        if (p == null && q == null) {
            return true;
        }

        if (p.val == q.val) {
            if ((p.left == null && q.left == null) && (p.right == null && q.right == null)) {
                return true;
            }
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}