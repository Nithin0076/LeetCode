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
        int c = 0;
        while(head != null)
        {
            c++;
            head = head.next;
        }
        return c;
    }
}