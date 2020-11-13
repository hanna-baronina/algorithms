package algorithms;


public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        ListNode second = new ListNode(3);
        head1.next = second;
        ListNode third = new ListNode(4);
        second.next = third;

        ListNode head2 = new ListNode(0);
        ListNode second2 = new ListNode(3);
        head2.next = second2;
        ListNode third2 = new ListNode(4);
        second2.next = third2;

        ListNode head3 = mergeTwoLists(head1, head2);

        while (head3 != null) {
            System.out.println(head3.val);
            head3 = head3.next;
        }
    }

    static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head3 = new ListNode();
        ListNode l3 = head3;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    l3.next = l1;
                    l1 = l1.next;
                    l3 = l3.next;
                } else {
                    l3.next = l2;
                    l2 = l2.next;
                    l3 = l3.next;
                }
            }
            if (l1 == null) {
                l3.next = l2;
                l2 = l2.next;
                l3 = l3.next;
            } else {
                l3.next = l1;
                l1 = l1.next;
                l3 = l3.next;
            }

        }
        return head3;
    }
}
