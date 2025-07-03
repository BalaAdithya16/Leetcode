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
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        if(head.next.next==null){
            return head.next;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            if(fast.next==null){
                fast=null;
            }
            else if(fast.next.next==null){
                slow=slow.next;
                fast=null;
            }
            else{
            slow=slow.next;
            fast=fast.next.next;
            }
        }
        return slow;
    }
}