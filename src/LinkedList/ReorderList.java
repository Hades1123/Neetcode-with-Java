package LinkedList;

public class ReorderList {
}

class Solution4 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        // Get middle node
        ListNode slow = head;
        ListNode fast = head.next; // fast = head --> quite good
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        ListNode prev = slow.next = null; // split list into 2 part from middle node

        //reverse list start with middle.next
        while(second != null) {
            ListNode nextNode = second.next;
            second.next = prev;
            prev = second;
            second = nextNode;
        }

        // merge two list
        ListNode first = head;
        second = prev; // prev = new head
        while(second != null) {
            ListNode nextNodeFirst = first.next;
            ListNode nextNodeSecond = second.next;
            first.next = second;
            second.next = nextNodeFirst;
            first = nextNodeFirst;
            second = nextNodeSecond;
        }

    }
}
