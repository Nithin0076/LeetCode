/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //HashSet<ListNode> hs = new HashSet<>();
        if(head == null || head.next == null)
            return null;
        ListNode s = head, f = head, p = head, th = head;
        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
            if(s == f)
            {
                while(s!=p)
                {
                    s = s.next;
                    p = p.next;
                }
                return s;
            }
        }
        return null;
    }
}