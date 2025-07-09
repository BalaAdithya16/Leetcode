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
        if(list1==null && list2==null){
            return null;
        }
        if(list1==null && list2!=null){
            return list2;
        }
        if(list1!=null && list2==null){
            return list1;
        }
        ListNode dum=new ListNode(-1);
        ListNode current=dum;
        while(list1!=null || list2!=null){
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;
            if(list1!=null){
                 a=list1.val;
            }
            if(list2!=null){
                 b=list2.val;
            }
            if(a<=b){
                current.next=new ListNode(a);
                current=current.next;
                list1=list1.next;
            }
            else{
                current.next=new ListNode(b);
                current=current.next;
                list2=list2.next;
            }
            }
        return dum.next;
    }
}
        