class MergeSortedLists 
{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
	{
        ListNode temp = new ListNode(-1);
        ListNode current = temp;

        // Traverse both lists and merge them
        while (list1 != null && list2 != null) 
		{
            if (list1.val <= list2.val) 
			{
                current.next = list1;
                list1 = list1.next;
            } 
			else 
			{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Append remaining nodes from either list1 or list2
        if (list1 != null) 
		{
            current.next = list1;
        } 
		else 
		{
            current.next = list2;
        }

        return temp.next;
    }

    public static void printList(ListNode head) 
	{
        while (head != null) 
		{
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
	{
        MergeSortedLists solution = new MergeSortedLists();

        // Create test cases
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        // Merge the lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.print("Merged List: ");
        printList(mergedList);
    }
}

class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
