package Linkedlist;

public class convertListIntoBsTree_109 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {

    }

    // Solution
    public TreeNode sortedListToBST(ListNode head) {
        return middle(head,null);
    }
    public TreeNode middle(ListNode head , ListNode tail){
        if(head==tail){
            return null;
        }
        ListNode slow=head ;
        ListNode fast=head;

        while(fast != tail && fast.next != tail){
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode nn =new TreeNode();
        nn.val=slow.val;
        nn.left=middle(head,slow);
        nn.right=middle(slow.next,tail);

        return nn;

    }
}
