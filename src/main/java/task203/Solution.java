package task203;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode newHead = head;
        ListNode prev = null;
        while (curr != null) {
            if (curr.val == val) {
                if (prev == null) {
                    curr = curr.next;
                    newHead = curr;
                } else{
                    prev.next = curr.next;
                    curr = prev.next;
                }
            } else {
                if (prev == null) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev = curr;
                    curr = prev.next;
                }
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode lst1 = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        ListNode lst2 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7, null))));
        lst1 = removeElements(lst1, 6);
        ListNode curr = lst1;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
