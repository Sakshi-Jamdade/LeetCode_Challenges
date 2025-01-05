class ListNode 
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddleNode 
{
    public ListNode deleteMiddle(ListNode head) 
    {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) 
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;    
    }

    public static void main(String[] args) 
    {
        DeleteMiddleNode solution = new DeleteMiddleNode();
        
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        
        ListNode newHead = solution.deleteMiddle(head);

        while (newHead != null) 
        {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
