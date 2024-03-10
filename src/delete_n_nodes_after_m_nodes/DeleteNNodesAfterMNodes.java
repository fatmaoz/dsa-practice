package delete_n_nodes_after_m_nodes;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

/**
 * Question-2 Delete N Nodes After M Nodes
 * You are given the head of a linked list and two integers m and n. Traverse the linked list and remove some nodes in the following way:
 * • Start with the head as the current node.
 * • Keep the first m nodes starting with the
 * current node.
 * • Remove the next n nodes.
 * • Keep repeating steps 2 and 3 until you
 * reach the end of the list.
 * Return the head of the modified list after removing the mentioned nodes.
 */

public class DeleteNNodesAfterMNodes {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode current = head;
        while (current != null) {
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                break;
            }
            
            ListNode temp = current;
            for (int i = 0; i < n && temp.next != null; i++) {
                temp = temp.next;
            }
            current.next = temp.next;
            current = current.next;
        }
        return head;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DeleteNNodesAfterMNodes solution = new DeleteNNodesAfterMNodes();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        int m = 2;
        int n = 3;

        System.out.println("Original List:");
        solution.printList(head);

        ListNode modifiedHead = solution.deleteNodes(head, m, n);

        System.out.println("Modified List:");
        solution.printList(modifiedHead);
    }
}
