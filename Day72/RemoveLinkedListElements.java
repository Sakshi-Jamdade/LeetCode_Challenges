public class RemoveLinkedListElements 
{
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) 
        {
            if (current.next.val == val) 
            {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }

    public void printList(ListNode head) 
    {
        ListNode current = head;
        while (current != null) 
        {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        System.out.print("Original list: ");
        solution.printList(head);

        ListNode result = solution.removeElements(head, 6);
        System.out.print("Modified list: ");
        solution.printList(result);

        ListNode head2 = null;
        System.out.print("Original list: ");
        solution.printList(head2);

        ListNode result2 = solution.removeElements(head2, 1);
        System.out.print("Modified list: ");
        solution.printList(result2);

        ListNode head3 = new ListNode(7, new ListNode(7, new ListNode(7, new ListNode(7))));
        System.out.print("Original list: ");
        solution.printList(head3);

        ListNode result3 = solution.removeElements(head3, 7);
        System.out.print("Modified list: ");
        solution.printList(result3);
    }
}
