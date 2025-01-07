package leetCode.day24;

import leetCode.common.ListNode;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/28 16:28
 * @Version: 1.0
 */
public class Swap {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode result = swapPairs(listNode);
        System.out.println(result);
    }
    /*
    交换节点
    1-2-3-4 ==》 2-1-4-3
    两两交换节点
     */
    public static ListNode swapTwoPairs(ListNode listNode) {
        ListNode first = listNode; // 1
        ListNode second = listNode.next; // 2
        first.next = null;
        second.next = listNode;
        return second;
    }

    public static ListNode swapPairs(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode first = listNode; // 1
        ListNode second = listNode.next; // 2
        first.next = swapPairs(second.next);
        second.next = first;
        StringBuilder stringBuilder = new StringBuilder();
        String a = null;
        stringBuilder.append(a);
        return second;
    }

}
