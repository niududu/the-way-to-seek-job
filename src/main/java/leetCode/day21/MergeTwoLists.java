package leetCode.day21;

import leetCode.common.ListNode;

/**
 * @Description:
 * @Author: LiuZW
 * @CreateDate: 2024/7/23 23:10
 * @Version: 1.0
 */
public class MergeTwoLists {

    public static void main(String[] args) {

    }

    // 迭代
    public static ListNode mergeTwoList1(ListNode list1, ListNode list2) {
        ListNode sentinel = new ListNode();
        ListNode pre = sentinel;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2 : list1;
        return sentinel.next;
    }

    //递归
    public static ListNode mergeTwoList(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.val < list2.val) {
            list1.next = mergeTwoList(list1.next,list2);
            return list1;
        } else {
            list2.next = mergeTwoList(list1,list2.next);
            return list2;
        }
    }



}
