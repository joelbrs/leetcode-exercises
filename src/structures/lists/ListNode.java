package structures.lists;

public class ListNode {
    public int val = -1;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void insertIntoNode(ListNode list, int... values) {
        ListNode currenNode = list; int currentIndex = 0;

        if (list.val < 0 && list.next == null) {
            currenNode.val = values[currentIndex];
            currentIndex++;
        }

        while (currenNode.next != null) {
            currenNode = currenNode.next;
        }

        while (currentIndex < values.length) {
            currenNode.next = new ListNode(values[currentIndex]);
            currentIndex++;
            currenNode = currenNode.next;
        }
    }

    public static void printNodeItems(ListNode list) {
        ListNode currentNode = list;

        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
