/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class PalindromeCheck 
{
    public boolean isPalindrome(ListNode head) 
	{
        if (head == null || head.next == null) 
		{
            return true;
        }

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) 
		{
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedSecondHalf = reverseList(slow);

        ListNode firstHalf = head;
        ListNode secondHalf = reversedSecondHalf;
        while (secondHalf != null) 
		{
            if (firstHalf.val != secondHalf.val) 
			{
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) 
	{
        ListNode prev = null, current = head, next = null;
        while (current != null) 
		{
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) 
	{
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        PalindromeCheck solution = new PalindromeCheck();
        System.out.println(solution.isPalindrome(head1)); // Output: true

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println(solution.isPalindrome(head2)); // Output: false
    }
}
