class LinkedListCycle 
{
    public boolean hasCycle(ListNode head) 
    {
        ListNode a = head, b = head;
        while (b != null && b.next != null) 
        {
            a = a.next;
            b = b.next.next;
            if (a == b)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        LinkedListCycle solution = new LinkedListCycle();
        System.out.println(solution.hasCycle(node1));

        ListNode singleNode1 = new ListNode(1);
        ListNode singleNode2 = new ListNode(2);
        singleNode1.next = singleNode2;
        singleNode2.next = singleNode1;
        System.out.println(solution.hasCycle(singleNode1));

        ListNode noCycleNode1 = new ListNode(1);
        ListNode noCycleNode2 = new ListNode(2);
        noCycleNode1.next = noCycleNode2;
        System.out.println(solution.hasCycle(noCycleNode1));
    }
}

class ListNode 
{
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
