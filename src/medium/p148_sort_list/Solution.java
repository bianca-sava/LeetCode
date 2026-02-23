package medium.p148_sort_list;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


class Solution {
    //Does not meet the O(n log n) time complexity requirement, but it works
    public ListNode sortList1(ListNode head) {
        if (head == null) return null;
        boolean switched = true;
        while(switched){
            switched = false;
            ListNode head_copy = head;
            while(head_copy.next!=null){
                if(head_copy.val > head_copy.next.val){
                    switched =true;
                    int aux = head_copy.val;
                    head_copy.val = head_copy.next.val;
                    head_copy.next.val = aux;
                }
                head_copy = head_copy.next;
            }
        }

        return head;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next=null;
        ListNode ll = sortList(head);
        ListNode lr = sortList(slow);

        return merge(ll, lr);
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode();
        ListNode current = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return res.next;

    }
}
