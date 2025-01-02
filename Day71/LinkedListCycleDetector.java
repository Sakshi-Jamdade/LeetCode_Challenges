class ListNode
{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleDetector 
{
    public ListNode detectCycle(ListNode head)
    {
        if (head == null || head.next == null) 
        {
            return null;
        }

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) 
            {
                break;
            }
        }

        if (fast == null || fast.next == null) 
        {
            return null;
        }

        slow = head;
        while (slow != fast) 
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; 
    }

    public static void main(String[] args) 
    {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; // Create cycle

        LinkedListCycleDetector detector = new LinkedListCycleDetector();
        ListNode cycleStart = detector.detectCycle(head);

        if (cycleStart != null) 
        {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } 
        else 
        {
            System.out.println("No cycle detected.");
        }
    }
}
