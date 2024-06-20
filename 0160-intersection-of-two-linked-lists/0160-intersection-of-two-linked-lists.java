/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 = size(headA), s2 = size(headB);
        int diff = Math.abs(s1-s2);
        if(s1 > s2)
        {
            while(diff-- > 0)
            {
                headA = headA.next;
            }
        }
        else
        {
            while(diff-- > 0)
                headB = headB.next;
        }
        
        while(headA != null)
        {
            if(headA == headB)
            {
                return headA;
            }
            else
            {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
    public static int size(ListNode head)
    {
        if(head == null)
            return 0;
        return 1+size(head.next);
    }
}