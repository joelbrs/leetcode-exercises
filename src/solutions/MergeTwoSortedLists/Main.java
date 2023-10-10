package solutions.MergeTwoSortedLists;

import structures.lists.ListNode;

import static structures.lists.ListNode.insertIntoNode;
import static structures.lists.ListNode.printNodeItems;

public class Main {
    public static void main(String[] args) {
        // 1,2,4
        ListNode list1 = new ListNode(), list2 = new ListNode();
        insertIntoNode(list1, 1);
        insertIntoNode(list1, 2);
        insertIntoNode(list1, 4);

        // 1,3,4
        insertIntoNode(list2, 1);
        insertIntoNode(list2, 3);
        insertIntoNode(list2, 4);

        printNodeItems(Solution.mergeTwoSortedLists(list1, list2));
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
}
