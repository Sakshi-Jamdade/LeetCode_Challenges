import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class NextGreaterNodeInLinkedList 
{
    public int[] nextLargerNodes(ListNode head) 
    {
        List<Integer> values = new ArrayList<>();
        while (head != null) 
        {
            values.add(head.val);
            head = head.next;
        }

        int n = values.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) 
        {
            while (!stack.isEmpty() && stack.peek() <= values.get(i)) stack.pop();
            result[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(values.get(i));
        }
        return result;
    }

    public static void main(String[] args) 
    {
        ListNode head = new ListNode(2);
        head.next = new ListNode(1);
        head.next.next = new ListNode(5);
        System.out.println(Arrays.toString(new NextGreaterNodeInLinkedList().nextLargerNodes(head)));
    }
}
