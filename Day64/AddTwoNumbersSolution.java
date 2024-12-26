class AddTwoNumbersSolution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	{
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) 
		{
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) 
	{
        // Create first number: 342 -> 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Create second number: 465 -> 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbersSolution solution = new AddTwoNumbersSolution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        System.out.print("Result: ");
        while (result != null) 
		{
            System.out.print(result.val);
			
            if (result.next != null) System.out.print(" -> ");
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
