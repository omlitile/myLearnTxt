package com.example.力扣Test;

public class Test234 {

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            //pre：前一个
            //slow：慢指针&&后一段链表的开头
            //fast：快指针，边界工具人
            //操作就是要把慢指针经过的逆置过来，所以让pre作为前一个，slow作为当前工具人，使用next去记录下一个，就是slow的下一位
            //变换时，先把前面的逆过来，slow再往下走
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        if (fast != null) {
            //！=NULL的这个情况就是奇数的情况，此时，slow工具人站在中间，pre就位，因此要让slow往前一个
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }
        return true;
    }


}
