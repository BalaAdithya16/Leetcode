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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        if(head.next==null || head.next.next==null){
            return head;
        }
        ListNode f=head;
        ListNode s=head.next;
        ListNode head1=new ListNode(f.val);
        ListNode temp=head1;
        while(f!=null && f.next!=null && f.next.next!=null){
            f=f.next.next;
            temp.next=new ListNode(f.val);
            temp=temp.next;
        }
        temp.next=new ListNode(s.val);
        temp=temp.next;
        while(s!=null && s.next!=null && s.next.next!=null){
            s=s.next.next;
            temp.next=new ListNode(s.val);
            temp=temp.next;
        }
        return head1;
    }
}