package structures.lists;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
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
