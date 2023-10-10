package solutions.MergeTwoSortedLists;

import structures.lists.ListNode;

public class Main {
    public static void main(String[] args) {
        // 1,2,4
        ListNode list1 = new ListNode(), list2 = new ListNode();
        Solution.insertIntoNode(list1, 1);
        Solution.insertIntoNode(list1, 2);
        Solution.insertIntoNode(list1, 4);

        // 1,3,4
        Solution.insertIntoNode(list2, 1);
        Solution.insertIntoNode(list2, 3);
        Solution.insertIntoNode(list2, 4);

        Solution.printNodeItems(Solution.mergeTwoSortedLists(list1, list2));
    }
}

class Solution {
    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        if (list1 != null || list2 != null) {
            ListNode mergedList = new ListNode(), elm1 = list1, elm2 = list2;

            while (elm1 != null && elm2 != null) {
                if (elm1.getVal() > elm2.getVal()) {
                    insertIntoNode(mergedList, elm2.getVal());
                    elm2 = elm2.getNext();
                } else {
                    insertIntoNode(mergedList, elm1.getVal());
                    elm1 = elm1.getNext();
                }
            }

            while (elm1 != null) {
                insertIntoNode(mergedList, elm1.getVal());
                elm1 = elm1.getNext();
            }

            while (elm2 != null) {
                insertIntoNode(mergedList, elm2.getVal());
                elm2 = elm2.getNext();
            }
            return mergedList;
        }
        return null;
    }

    public static void insertIntoNode(ListNode list, int value) {
        ListNode elm = list;

        if (elm.getVal() == 0 && elm.getNext() == null) {
            elm.setVal(value);
            return;
        }

        while (elm.getNext() != null) {
            elm = elm.getNext();
        }

        elm.setNext(new ListNode(value));
    }

    public static void printNodeItems(ListNode list) {
        ListNode elm = list;

        while (elm != null) {
            System.out.print(elm.getVal() + " ");
            elm = elm.getNext();
        }
        System.out.println();
    }
}
