class MergeKSortedLists 
{
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ListNode dummy = new ListNode(0), current = dummy;

        while (true) 
        {
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) 
            {
                if (lists[i] != null && (minIndex == -1 || lists[i].val < lists[minIndex].val)) 
                {
                    minIndex = i;
                }
            }
            if (minIndex == -1) break;
            current.next = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            current = current.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) 
    {
        MergeKSortedLists solution = new MergeKSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode l3 = new ListNode(2, new ListNode(6));
        ListNode[] lists = {l1, l2, l3};

        // Merging the lists
        ListNode mergedList = solution.mergeKLists(lists);

        // Printing the merged linked list
        while (mergedList != null) 
        {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
