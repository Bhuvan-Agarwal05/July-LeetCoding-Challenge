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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        else if(head.next==null && val==head.val)
            return null;
        else
        {
            ListNode prev , temp;
            prev = temp = head;
            while(temp!=null)
            {
                if(temp.val==val)
                {
                   if(temp==head)
                   {
                       head = head.next;
                       prev = head;
                       temp=head;
                   }
                   else if(temp.next==null)
                   {
                        prev.next=null;
                        temp = temp.next;
                   }
                   else
                   {
                        prev.next = temp.next;
                        temp=prev.next;
                   }
                }
                else
                {
                    prev = temp;
                    temp = temp.next;
                }
            }
            
            return head;
        }
    }
}