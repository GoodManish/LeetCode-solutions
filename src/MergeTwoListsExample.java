import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

public class MergeTwoListsExample {

    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        ListNode dummy = new ListNode(-1);
        ListNode L3 = dummy;

        while (L1 != null && L2 != null) {
            if (L1.val < L2.val) {
                L3.next = L1;
                L1 = L1.next;
            } else if (L1.val >= L2.val) {
                L3.next = L2;
                L2 = L2.next;
            }
            L3 = L3.next;
        }
        if (L1 != null) {
            L3.next = L1;
        }
        if (L2 != null) {
            L3.next = L2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2; l2.next = l3;

        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(4);
        m1.next = m2; m2.next = m3;

        MergeTwoListsExample mergeTwoListsExample = new MergeTwoListsExample();
        ListNode mergeTwoLists = mergeTwoListsExample.mergeTwoLists(l1, m1);
        System.out.println(mergeTwoLists);
    }
}


//        Input: 1->2->4, 1->3->4       = 1,1,2,3,4
//        Input: 1->2->4, 11->31->41    = 1,2,4,11,31,41
//        Input: 11->21->41, 7->8->10   = 7,8,10,11,21,41
//        Input: 11->21->41, 7->8->10   = 7,8,10,11,21,41
