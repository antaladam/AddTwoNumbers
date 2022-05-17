package Solution;

import ListNode.ListNode;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carryover = false;
        int sum = 0;
        ListNode head = null;
        ListNode solution = null;
        while (l1 != null || l2 != null || carryover){
            sum = 0;
            if (solution == null) {solution = new ListNode();}
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            if (carryover) {
                sum += 1;
                carryover = false;
            }
            if (sum >= 10) {
                sum = sum - 10;
                carryover = true;
            }
            if (head == null){
                head = solution;
            }
            solution.next = new ListNode(sum);
            solution = solution.next;
        }
        return head;
    }
}
