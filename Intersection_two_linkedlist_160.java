package Linkedlist;

public class Intersection_two_linkedlist_160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A=headA;
            ListNode B=headB;
            while(A!=B){
                if (A==null){
                    B=headA;
                }
                else {
                    A=A.next;
                } if (B==null){
                    A=headB;
                }
                else {
                    B=B.next;
                }
            }
            return A;
        }
    }
}
