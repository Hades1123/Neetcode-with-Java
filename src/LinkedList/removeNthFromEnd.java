package LinkedList;

public class removeNthFromEnd {
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sizeList = 0;
        ListNode cur = head;
        while (cur != null) {
            sizeList++;
            cur = cur.next;
        }
        if (sizeList == n) {
            head = head.next;
            return head;
        }
        cur = head;
        for (int i = 1 ; i <= sizeList - n - 1 ; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }
}