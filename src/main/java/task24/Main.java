package task24;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static ListNode swapPairs(ListNode head) {
        ListNode currentNode = head, tmp, prev = null, nextPair = null;
        if (head != null && currentNode.next != null) head = currentNode.next;
        while (currentNode != null && currentNode.next != null) {
            if (prev != null) prev.next = currentNode.next;
            tmp = currentNode.next;
            currentNode.next = currentNode.next.next;
            tmp.next = currentNode;
            prev = currentNode;
            currentNode = currentNode.next;
        }
        return head;
    }
}

public class Main {
    static ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));

    public static void main(String[] args) {
        ListNode tmp = head;
        tmp = Solution.swapPairs(head);
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}
