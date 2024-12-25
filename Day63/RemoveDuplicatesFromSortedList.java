class RemoveDuplicatesFromSortedList 
{
    public ListNode deleteDuplicates(ListNode head) 
	{
        ListNode current = head;
        while (current != null && current.next != null) 
		{
            if (current.val == current.next.val) 
			{
                current.next = current.next.next;
            } 
			else 
			{
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) 
	{
        // Create the linked list: 1 -> 1 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);

        // Call deleteDuplicates method
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        ListNode result = solution.deleteDuplicates(head);

        // Print the result
        while (result != null) 
		{
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode 
{
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) 
	{
        this.val = val;
    }

    ListNode(int val, ListNode next) 
	{
        this.val = val;
        this.next = next;
    }
}
