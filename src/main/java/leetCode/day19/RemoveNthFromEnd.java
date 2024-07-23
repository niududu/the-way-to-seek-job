package leetCode.day19;

import leetCode.common.ListNode;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/23 22:53
 * @Version: 1.0
 */
public class RemoveNthFromEnd {

    public static void main(String[] args) {

    }

    /***
     * 删除链表的倒数第 n 个结点，并且返回链表的头结点。
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode();
        node.next = head;
        int length = 0;
        // 计算head的长度
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        int index = length - n;
        current = node;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return node.next;
    }
}
