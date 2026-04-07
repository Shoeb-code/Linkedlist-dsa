package Linkedlist;

import leetcode.bt_postoder_tra_145;

import java.util.ArrayList;

public class nxt_grtr_node_1019 {
    public class ListNode {
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next; }
  }

    class Solution {
        public int[] nextLargerNodes(ListNode head) {
               return element(head);
        } // 2  7  4  3  5 ---> 7 0 5 5 0
        public static int [] element(ListNode nn){
            ArrayList<Integer> ll=new ArrayList<>();
            ListNode temp = nn ;

            if (temp==null || temp.next==null){
                ll.add(0);
            }
            while (temp != null ){
                ListNode nextnode=temp.next;
                if (nextnode == null) {
                    ll.add(0); // Add 0 for the last node since there's no next node
                }
                 if (temp.val>nextnode.val){
                  ll.add(checkfurther(temp,nextnode));
                     temp=temp.next;
                 }
                 else {
                     ll.add(nextnode.val);
                     temp=temp.next;
                 }
            }
            int [] arr =new int[ll.size()];
            for (int i=0; i< arr.length; i++){
                arr[i]=ll.get(i);
            }
            return arr;
        } // 2  7  4  3  5 ---> 7 0 5 5 0
        public static int checkfurther( ListNode fixed ,ListNode head ){
            while (head!=null){
                if (fixed.val> head.val){
                      head=head.next;
                }
                else{
                   return head.val;
                }
            }
           return 0;
        }

    }
}
