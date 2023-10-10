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
        if ((Objects.isNull(p) && !Objects.isNull(q)) || (Objects.isNull(q) && !Objects.isNull(p))) {
            return false;
        }

        if (Objects.isNull(p) && Objects.isNull(q)) {
            return true;
        }

        if (p.getVal() == q.getVal()) {
            if ((Objects.isNull(p.getLeft()) && Objects.isNull(q.getLeft())) && (Objects.isNull(p.getRight()) && Objects.isNull(q.getRight()))) {
                return true;
            }
        }

        return p.getVal() == q.getVal() && isSameTree(p.getLeft(), q.getLeft()) && isSameTree(p.getRight(), q.getRight());
    }
}