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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        ListNode d1 = new ListNode(-1), d2 = new ListNode(-1),td1 = d1, td2 = d2;
        while(head != null)
        {
            if(head.val < x)
            {
                d1.next = head;
                d1 = d1.next;
            }
            else
            {
                d2.next = head;
                d2 = d2.next;
            }
            head = head.next;
        }
        d2.next = null;
        d1.next = td2.next;
        return td1.next;
    }
}