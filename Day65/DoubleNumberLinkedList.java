/**
 * Definition for singly-linked list.
 * public class ListNode 
 {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
public class DoubleNumberLinkedList 
{
    // Helper function to reverse the linked list
    private ListNode reverseLL(ListNode head) 
	{
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) 
		{
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public ListNode doubleIt(ListNode head) 
	{
        // Reverse the linked list
        ListNode nhead = reverseLL(head);

        ListNode dummy = new ListNode(-1); 
        ListNode ans = dummy;

        int carry = 0;

        while (nhead != null) 
		{
            int sum = nhead.val * 2 + carry; 
            int digit = sum % 10; 
            carry = sum / 10; 

            ListNode temp = new ListNode(digit);
            dummy.next = temp;
            dummy = dummy.next;

            nhead = nhead.next; // Move to the next node
        }

        if (carry > 0) {
            dummy.next = new ListNode(carry);
        }

        return reverseLL(ans.next);
    }

    public static void main(String[] args) 
	{
        ListNode head = new ListNode(1, new ListNode(8, new ListNode(9)));

        DoubleNumberLinkedList solution = new DoubleNumberLinkedList();
        ListNode doubledList = solution.doubleIt(head);

        System.out.print("Doubled List: ");
        while (doubledList != null) 
		{
            System.out.print(doubledList.val);
            if (doubledList.next != null) 
			{
                System.out.print(" -> ");
            }
            doubledList = doubledList.next;
        }
    }
}
