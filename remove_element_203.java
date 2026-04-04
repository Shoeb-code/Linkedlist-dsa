package Linkedlist;

public class remove_element_203 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode temp=new ListNode(-1);
            temp.next=head;
            ListNode current = temp;
            while(current.next!=null){
                if(current.next.val!=val){
                    current=current.next;
                }
                else {
                    current.next=current.next.next;
                }
            }
            return temp.next;
        }
    }
}
