import ListNode.ListNode;
import Solution.Solution;

public class main {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode a2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        Solution asd = new Solution();
        System.out.println(asd.addTwoNumbers(a1,a2));

    }
}
