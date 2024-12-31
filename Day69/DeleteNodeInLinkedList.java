public class DeleteNodeInLinkedList 
{
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) 
        {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) 
    {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        System.out.println("Initial Linked List:");
        printList(head);

        ListNode nodeToDelete = head.next;
        new DeleteNodeInLinkedList().deleteNode(nodeToDelete);

        System.out.println("Modified Linked List:");
        printList(head);
    }

    public static void printList(ListNode head) 
    {
        ListNode current = head;
        while (current != null) 
        {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) 
    {
        val = x;
    }
}
