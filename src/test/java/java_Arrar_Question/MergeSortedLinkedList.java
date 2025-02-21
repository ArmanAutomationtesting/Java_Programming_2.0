package java_Arrar_Question;

import java.lang.classfile.components.ClassPrinter;
import java.util.List;

 class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

}
    public class MergeSortedLinkedList {
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
            ListNode current = dummy;         // Pointer to build the merged list

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }

            // If any nodes remain in either list, append them
            if (list1 != null) {
                current.next = list1;
            } else if (list2 != null) {
                current.next = list2;
            }

            return dummy.next; // Return merged list starting from the first real node
        }

        // Helper method to print linked list
        public static void printList(ListNode head) {
            while (head != null) {
                System.out.print(head.val + " -> ");
                head = head.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            // Example usage
            ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
            ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

            System.out.println("List 1:");
            printList(list1);
            System.out.println("List 2:");
            printList(list2);

            ListNode mergedHead = mergeTwoLists(list1, list2);
            System.out.println("Merged List:");
            printList(mergedHead);
        }
    }
