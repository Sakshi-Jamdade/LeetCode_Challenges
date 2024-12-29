public class IntersectionFinder 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if (headA == null || headB == null) return null;

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB) 
        {
            ptrA = (ptrA == null) ? headB : ptrA.next;
            ptrB = (ptrB == null) ? headA : ptrB.next;
        }

        return ptrA;
    }

    public static void main(String[] args) 
    {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode intersection = new ListNode(8);
        headA.next.next = intersection;
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        ListNode headB = new ListNode(6);
        headB.next = intersection;

        IntersectionFinder finder = new IntersectionFinder();
        ListNode result = finder.getIntersectionNode(headA, headB);

        if (result != null) 
        {
            System.out.println("Intersection at node with value: " + result.val);
        }
        else 
        {
            System.out.println("No intersection found.");
        }
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
