package khj.study;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        this.val = x;
    }
}


public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(2);
        ListNode node = solve(l1, l2);
        while(node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static ListNode solve(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode next = result;

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int ban = 0;
        while (temp1 != null) {
            if (temp1.val + temp2.val + ban >= 10) {
                next.next = new ListNode(temp1.val + temp2.val + ban - 10);
                ban = 1;
            } else {
                next.next = new ListNode(temp1.val + temp2.val + ban);
                ban = 0;
            }
            next = next.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if (ban == 1) {
            next.next = new ListNode(1);
        }

        return result.next;
    }
}
