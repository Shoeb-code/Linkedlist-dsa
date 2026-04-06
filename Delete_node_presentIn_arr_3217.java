package Linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Delete_node_presentIn_arr_3217 {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode modifiedList(int[] nums, ListNode head) {
return deleteNodes(nums,head);
        }
        public ListNode deleteNodes(int [] nums, ListNode head){
            HashSet<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num); // Store values in HashSet for O(1) lookup
            }
           ListNode dummy=new ListNode(0);
           dummy.next=head;
           ListNode s=dummy;
           ListNode f=head;
           while (f!=null){
               if (set.contains(f.val)){
                   f=f.next;
               }
               else {
                   s.next=f;
                   s=f;
                   f=f.next;
               }
           }
           s.next=null;
           return dummy.next;
        }

}
}
