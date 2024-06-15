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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d = new ListNode(-1);
        ListNode th = d;
        while(list1 != null && list2 != null)
        {
            if(list1.val < list2.val)
            {
                d.next = list1;
                list1 = list1.next;
            }
            else
            {
                d.next = list2;
                list2 = list2.next;
            }
            d = d.next;
        }
        if(list1 != null)
            d.next = list1;
        else
            d.next = list2;
        return th.next;
    }
}