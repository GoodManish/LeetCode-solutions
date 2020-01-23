public class RemoveitemFromLinkedList {

    public Node removeElements(Node head, int val) {
        Node dummy = new Node(0); dummy.next = head;
        Node p = dummy;

        while(p!=null && p.next!=null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            }else
                p = p.next;

        }
        return dummy.next;
    }
    //head:  1->2->6->3->4->5->6,
    // val = 6
    //Output: 1->2->3->4->5
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(6);
        Node l4 = new Node(3);
        Node l5 = new Node(4);
        Node l6 = new Node(5);
        Node l7 = new Node(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        int val = 6;

        RemoveitemFromLinkedList rem = new RemoveitemFromLinkedList();
        rem.removeElements(l1,val);
//
//        ListNode m1 = new ListNode(1);
//        ListNode m2 = new ListNode(3);
//        ListNode m3 = new ListNode(4);
//        m1.next = m2; m2.next = m3;
    }
}


// * Definition for singly-linked list.
 class Node {
     int val;
     Node next;
     Node(int x) { val = x; }

}
