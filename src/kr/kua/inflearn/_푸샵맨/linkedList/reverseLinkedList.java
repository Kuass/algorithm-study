package kr.kua.inflearn._푸샵맨.linkedList;

public class reverseLinkedList {
    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode res = solve(l1);
    }

    static ListNode solve(ListNode cur) {
        // 1. ds
        ListNode next = null;
        ListNode prev = null;

        // 2. for while
        while (cur != null) {
            next = cur.next; // cur 다음 step 2n - 30
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
