public class 牛客链表中倒数第k个结点 {
    private int length(ListNode head) {
        int len = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            len++;
        }
        return len;
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = length(head);
        ListNode cur = head;
        for (int i = 0; i < len-k; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
