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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0 )
            return head;
        ListNode th = head, prev = null;
        int length = 1;
        while(th.next != null)
        {
            th = th.next;
            length += 1;
        }
        th.next = head;
        int nor = k%length;
        for(int i =0; i<length; i++)
        {
            if(i == (length-nor-1))
            {
                th = head.next;
                head.next = null;
                break;
            }
            else
            {
                head = head.next;
            }
        }
        return th;
    }
}