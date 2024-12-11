import java.util.Stack;

class DecodeString  
{
    public String decodeString(String s) 
    {
        Stack<String> stack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char c : s.toCharArray()) 
        {
            if (Character.isDigit(c)) 
            {
                k = k * 10 + (c - '0'); 
            } 
            else if (c == '[') 
            {
                countStack.push(k);
                stack.push(current.toString());
                current = new StringBuilder();
                k = 0;
            } 
            else if (c == ']') 
            {
                StringBuilder temp = new StringBuilder(stack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) temp.append(current);
                current = temp;
            } 
            else 
            {
                current.append(c); 
            }
        }
        return current.toString();   
    }
	public static void main(String[] args) 
	{
        System.out.println(decodeString("3[a]2[bc]")); 
        System.out.println(decodeString("3[a2[c]]")); 
        System.out.println(decodeString("2[abc]3[cd]ef")); 
    }
}