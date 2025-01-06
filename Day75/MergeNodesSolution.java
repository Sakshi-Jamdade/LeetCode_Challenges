class MergeNodesSolution 
{
    public ListNode mergeNodes(ListNode head) 
    {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode iterator = head.next;
        int sum = 0;

        while (iterator != null) 
        {
            if (iterator.val == 0) 
            {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            } 
            else 
            {
                sum += iterator.val;
            }
            iterator = iterator.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) 
    {
        ListNode head = new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0))))))));

        MergeNodesSolution solution = new MergeNodesSolution();
        ListNode result = solution.mergeNodes(head);

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
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
