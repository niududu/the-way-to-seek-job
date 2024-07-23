package leetCode.common;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/23 22:53
 * @Version: 1.0
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
