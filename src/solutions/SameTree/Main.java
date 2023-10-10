package solutions.SameTree;

import structures.trees.TreeNode;

import java.util.Objects;

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

        if (p.getVal() == q.getVal()) {
            if ((p.getLeft() == null && q.getLeft() == null) && (p.getRight() == null && q.getRight() == null)) {
                return true;
            }
        }

        return p.getVal() == q.getVal() && isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
    }
}