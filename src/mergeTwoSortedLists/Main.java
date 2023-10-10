package mergeTwoSortedLists;

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

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        if (list1 != null || list2 != null) {
            ListNode mergedList = new ListNode(), elm1 = list1, elm2 = list2;

            while (elm1 != null && elm2 != null) {
                if (elm1.val > elm2.val) {
                    insertIntoNode(mergedList, elm2.val);
                    elm2 = elm2.next;
                } else {
                    insertIntoNode(mergedList, elm1.val);
                    elm1 = elm1.next;
                }
            }

            while (elm1 != null) {
                insertIntoNode(mergedList, elm1.val);
                elm1 = elm1.next;
            }

            while (elm2 != null) {
                insertIntoNode(mergedList, elm2.val);
                elm2 = elm2.next;
            }
            return mergedList;
        }
        return null;
    }

    public static void insertIntoNode(ListNode list, int value) {
        ListNode elm = list;

        if (elm.val == 0 && elm.next == null) {
            elm.val = value;
            return;
        }

        while (elm.next != null) {
            elm = elm.next;
        }

        elm.next = new ListNode(value);
    }

    public static void printNodeItems(ListNode list) {
        ListNode elm = list;

        while (elm != null) {
            System.out.print(elm.val + " ");
            elm = elm.next;
        }
        System.out.println();
    }
}
