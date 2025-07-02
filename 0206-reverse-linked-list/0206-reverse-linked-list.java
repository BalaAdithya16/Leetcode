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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        head=head.next;
        ListNode after=head.next;
        temp.next=null;
        while(head.next!=null){
            head.next=temp;
            temp=head;
            head=after;
            after=after.next;
        }
        head.next=temp;
        return head;
    }
}