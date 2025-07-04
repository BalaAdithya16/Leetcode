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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode temp=head;
        ListNode prev=null;
        int count=0;
        boolean b=true;
        while(temp.next!=null){
            count++;
            temp=temp.next;
            if(count>=n){
                if(b){
                prev=head;
                b=false;
                }
                else{
                prev=prev.next;
                }
            }
        }
        if(prev==null){
            return head.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}