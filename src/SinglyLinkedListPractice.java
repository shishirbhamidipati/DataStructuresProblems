import java.util.List;
public class SinglyLinkedListPractice {
    public static void main(String[] args) {


    }

    class LinkedList {
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        }

        public ListNode reverseList(ListNode head) {
            //1) Reverse a Singly Linked List:
            //Write a function to reverse a singly linked list.
            ListNode prev = null;
            ListNode curr = head;
            while (curr != null) {
                ListNode nextTemp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextTemp;
            }
            return prev;
        }

        public boolean hasLoop(ListNode head){
            //2) Detect a Loop in a Linked List:
            //Write a function to detect if there is a loop in a linked list.
            if (head == null || head.next == null){
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null){
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }

        //3) Find the Middle Node of a Linked List:
        //Write a function to find the middle node of a singly linked list.
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        //4)Remove Duplicates from Sorted Linked List:
        //Write a function to remove duplicates from a sorted linked list.
        public ListNode deleteDupe(ListNode head) {
            ListNode current = head;
            while (current != null && current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
        //5) Merge Two Sorted Linked Lists:
        //Write a function to merge two sorted singly linked lists into one sorted list.
        public ListNode merge(ListNode l1, ListNode l2) {
            ListNode temp = new ListNode(-1);
            ListNode current = temp;
            while (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
            current.next = (l1 != null) ? l1 : l2;
            return temp.next;
        }

        //6)Remove N-th Node from End of List:
        //Write a function to remove the N-th node from the end of a linked list.
        public ListNode removeFromEnd(ListNode head, int n) {
            ListNode temp = new ListNode(0);
            temp.next = head;
            ListNode first = temp;
            ListNode second = temp;
            for (int i = 1; i <= n + 1; i++) {
                first = first.next;
            }
            while (first != null) {
                first = first.next;
                second = second.next;
            }
            second.next = second.next.next;
            return temp.next;

        }

        //7) Find the Intersection Point of Two Linked Lists
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null){
                return null;
            }
            ListNode a = headA;
            ListNode b = headB;
            while (a != b) {
                a = (a == null) ? headB : a.next;
                b = (b == null) ? headA : b.next;
            }
            return a;
        }
        //8) Rotate linked list to the right:
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null){
                return head;
            }
            ListNode old = head;
            int length = 1;
            while (old.next != null) {
                old = old.next;
                length++;
            }
            old.next = head;
            ListNode newT = head;
            for (int i = 0; i < length - k % length - 1; i++) {
                newT = newT.next;
            }
            ListNode newHead = newT.next;
            newT.next = null;
            return newHead;
        }

    }
}
