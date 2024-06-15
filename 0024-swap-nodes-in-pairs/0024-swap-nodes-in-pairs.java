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
    public ListNode swapPairs(ListNode head) {
        ListNode temp, th = head;
        while(head != null && head.next != null)
        {
            int x = head.val;
            head.val = head.next.val;
            head.next.val = x;
            head = head.next.next;
        }
        return th;
    }
}