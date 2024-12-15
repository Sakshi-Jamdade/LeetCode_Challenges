import java.util.Stack;

class ParenthesisValidator 
{
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') 
            {
                st.push(ch);
            } 
            else if (st.size() > 0 && ch == ']' && st.peek() == '[') 
            {
                st.pop();
            } 
            else if (st.size() > 0 && ch == ')' && st.peek() == '(') 
            {
                st.pop();
            } 
            else if (st.size() > 0 && ch == '}' && st.peek() == '{') 
            {
                st.pop();
            } 
            else 
            {
                return false;
            }
        }
        return st.size() == 0;
    }

    public static void main(String[] args) 
    {
        ParenthesisValidator validator = new ParenthesisValidator();

        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "([)]";
        String test4 = "{[]}";

        System.out.println("Test case 1: " + validator.isValid(test1)); // Expected: true
        System.out.println("Test case 2: " + validator.isValid(test2)); // Expected: false
        System.out.println("Test case 3: " + validator.isValid(test3)); // Expected: false
        System.out.println("Test case 4: " + validator.isValid(test4)); // Expected: true
    }
}
