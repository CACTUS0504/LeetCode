package task206;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {
    public static ListNode reverseList(ListNode head) {
        ListNode curr, prev, next;
        curr = head;
        prev = null;
        next = null;
        ListNode newHead = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            newHead = curr;
            prev = curr;
            curr = next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode newHead = reverseList(head);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
