/* You are given two non-empty linked lists representing two non-negative integers.
   The digits are stored in reverse order and each of their nodes contain a single digit.
   Add the two numbers and return it as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example:
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807
*/

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        return null;
    }

    // 2 -> 4 -> 6 -> 5
    static ListNode reverse(ListNode head) {
        ListNode curr, prev, nextNode;

        curr = head;
        prev = null;

        while (curr != null) {
            nextNode = curr.next; // hold the current head next node & siblings information, as this will get removed bcoz curr.next will to point prev node.
            curr.next = prev;     // in order to reverse, curr.next has to point to prev node.
            prev = curr;          // previous (prev) has to move to next node
            curr = nextNode;      // move curr to next node i.e. nextNode which'll have all the information for traversal
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head  = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);
        ListNode node3 = new ListNode(5);

        head.next  = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode reversed = reverse(head);
    }
}
