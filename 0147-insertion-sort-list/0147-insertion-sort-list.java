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
    public ListNode insertionSortList(ListNode head) {
        ListNode d = new ListNode(Integer.MAX_VALUE);
        while(head != null)
        {
            ListNode th = d, next = head.next;
            while(th.next != null && th.next.val<head.val)
            {
                th = th.next;
            }
            head.next = th.next;
            th.next= head;
            head = next;
        }
        return d.next;
    }
}