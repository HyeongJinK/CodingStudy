package khj.study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeKSortedList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;
        MergeKSortedList a = new MergeKSortedList();
        ListNode result = a.mergeKLists(list);
        System.out.println("====");
        while(result !=null) {
            System.out.println(result.val);
            result= result.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();

        for (ListNode ln: lists) {
            while (ln != null) {
                list.add(ln.val);
                ln = ln.next;
            }
        }

        list.sort(Comparator.comparingInt(o -> o));

        ListNode result = new ListNode(0);
        ListNode p = result;
        for (Integer l: list) {
            p.next = new ListNode((Integer) l);
            p = p.next;
        }

        return result.next;
    }
}
