package khj.study;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        printNode(l1);
        ListNode head = reverseList(l1);
        printNode(head);
    }

    public static ListNode reverseList(ListNode current) {
        ListNode prev = null;
        ListNode next;

        // next 2, 3
        // current 1, null
        // prev 1, null
        // current 2, 3
        // next 3
        // current 2, 1, null
        // prev 2, 1, null
        // current 3
        // next null
        // current 3, 2, 1, null
        // prev 3, 2, 1, null
        // current null
        while(current !=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printNode(ListNode head) {
        System.out.println("printNOde: ");
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }
}
