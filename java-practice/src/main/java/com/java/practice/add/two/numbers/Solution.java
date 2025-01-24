package com.java.practice.add.two.numbers;

public class Solution {

    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;


        while ( l1 != null || l2 != null ) {

            int val1 = ( l1 != null ) ? l1.val : 0;
            int val2 = ( l2 != null ) ? l2.val : 0;


            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if ( l1 != null ) l1 = l1.next;
            if ( l2 != null ) l2 = l2.next;
        }

        if ( carry > 0 ) {
            current.next = new ListNode(carry);
        }


        return dummyHead.next;
    }


    public static void main (String[] args) {

        ListNode l1 = new ListNode(9);
        l1 = new ListNode(9, l1);
        l1 = new ListNode(9, l1);
        l1 = new ListNode(9, l1);
        l1 = new ListNode(9, l1);
        l1 = new ListNode(9, l1);
        l1 = new ListNode(9, l1);

        ListNode l2 = new ListNode(9);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);
        l2 = new ListNode(9, l2);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        while ( result != null ) {
            System.out.print(result.val);
            if ( result.next != null ) System.out.print(" -> ");
            result = result.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode () {
    }

    ListNode (int val) {
        this.val = val;
    }

    ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
