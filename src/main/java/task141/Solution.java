package task141;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public static boolean hasCycle(ListNode head) {
        ListNode ptr1 = head, ptr2 = head;
        if (head == null) return false;
        while (ptr1.next != null && ptr2.next != null && ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode ptr1 = new ListNode(2);
        ListNode ptr2 = new ListNode(0);
        ListNode ptr3 = new ListNode(-4);
        head.next = ptr1;
        ptr1.next = ptr2;
        ptr2.next = ptr3;
        ptr3.next = ptr1;
        System.out.println(hasCycle(head));
    }
}