class RemoveNthNode 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        
        for (int i = 0; i <= n; i++) 
        {
            first = first.next;
        }
        
        while (first != null) 
        {
            first = first.next;
            second = second.next;
        }
        
        second.next = second.next.next;
        return dummy.next;
    }
    
    public static void main(String[] args) 
    {
        RemoveNthNode solution = new RemoveNthNode();
        
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        
        int n = 2;
        ListNode result = solution.removeNthFromEnd(head, n);
        
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
