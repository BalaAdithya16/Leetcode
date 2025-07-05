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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode curry=dummy;
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        while(temp1!=null || temp2!=null){
            int sum=0;
            sum+=carry;
            if(temp1!=null){
                sum+=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.val;
                temp2=temp2.next;
            }
        carry=sum/10;
        sum=sum%10;
        curry.next=new ListNode(sum);
        curry=curry.next;
        }
        if(carry==1){
            curry.next=new ListNode(1);;
            curry=curry.next;
        }
        return dummy.next;
    }
}