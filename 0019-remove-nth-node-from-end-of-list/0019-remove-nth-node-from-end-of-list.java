/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        if(n>=size)
            return head.next;
        if(size == 1 && n == 1)
            return null;
        ListNode th = head;
        for(int i = 0; i<size; i++)
        {
            if(i == (size-n-1))
            {
                head.next = head.next.next;
            }
            else
                head = head.next;
        }
        return th;
    }
    static int size(ListNode h)
    {
        if(h == null)
            return 0;
        return 1+size(h.next);
    }
}