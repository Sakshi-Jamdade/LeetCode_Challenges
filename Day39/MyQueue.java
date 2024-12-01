import java.util.Stack;

class MyQueue 
{
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() 
	{
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) 
	{
        stack1.push(x);
    }
    
    public int pop() 
	{
        if (stack2.isEmpty()) 
		{
            while (!stack1.isEmpty()) 
			{
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() 
	{
        if (stack2.isEmpty()) 
		{
            while (!stack1.isEmpty()) 
			{
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    public boolean empty() 
	{
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) 
	{
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println("Front of the queue: " + obj.peek()); // Should print 1
        System.out.println("Popped element: " + obj.pop());   // Should print 1
        System.out.println("Is the queue empty? " + obj.empty()); // Should print false
        obj.push(3);
        System.out.println("Front of the queue: " + obj.peek()); // Should print 2
        System.out.println("Popped element: " + obj.pop());   // Should print 2
        System.out.println("Is the queue empty? " + obj.empty()); // Should print false
    }
}
