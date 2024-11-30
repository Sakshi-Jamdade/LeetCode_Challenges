import java.util.LinkedList;
import java.util.Queue;

class MyStack 
{
    private Queue<Integer> queue;

    public MyStack() 
	{
        queue = new LinkedList<>();
    }

    public void push(int x) 
	{
        queue.offer(x);
        for (int i = 1; i < queue.size(); i++) 
		{
            queue.offer(queue.poll());
        }
    }

    public int pop() 
	{
        return queue.poll();
    }

    public int top() 
	{
        return queue.peek();
    }

    public boolean empty() 
	{
        return queue.isEmpty();
    }

    public static void main(String[] args) 
	{
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.top());  // Output: 2
        System.out.println("Popped element: " + stack.pop());  // Output: 2
        System.out.println("Top element after pop: " + stack.top());  // Output: 1
        System.out.println("Is the stack empty? " + stack.empty());  // Output: false

        stack.pop();  // Pop the remaining element
        System.out.println("Is the stack empty after popping all elements? " + stack.empty());  // Output: true
    }
}
