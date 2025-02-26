package LinkedList;

public class AddTwoNumbers {
}

class Solution7{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null) {
            int sum = l1.val + carry;
            tail.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            tail = tail.next;
        }

        while(l2 != null) {
            int sum = l2.val + carry;
            tail.next = new ListNode(sum % 10);
            carry = sum / 10;
            l2 = l2.next;
            tail = tail.next;
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return dummy.next;
    }
}
