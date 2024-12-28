class OddEvenLinkedList 
{
    public ListNode oddEvenList(ListNode head) 
	{
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) 
		{
            odd.next = even.next;
            odd = odd.next;
            
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }

    public static void main(String[] args) 
	{
        OddEvenLinkedList solution = new OddEvenLinkedList();

        // Create a sample linked list: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Display original list
        System.out.println("Original List:");
        printList(head);

        // Reorder list
        ListNode result = solution.oddEvenList(head);

        // Display reordered list
        System.out.println("Reordered List:");
        printList(result);
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) 
	{
        ListNode current = head;
        while (current != null) 
		{
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Definition for singly-linked list
class ListNode 
{
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
