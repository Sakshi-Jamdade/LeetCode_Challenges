public class ReverseWords 
{
    public static String reverseWords(String s) 
	{
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) 
		{
            reversed.append(words[i]);
            if (i > 0) 
			{ 
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) 
	{
        // Test cases
        String s1 = "the sky is blue";
        String s2 = "   hello world  ";
        String s3 = "a   good   example";
        String s4 = "hello";

        System.out.println(reverseWords(s1)); // Output: "blue is sky the"
        System.out.println(reverseWords(s2)); // Output: "world hello"
        System.out.println(reverseWords(s3)); // Output: "example good a"
        System.out.println(reverseWords(s4)); // Output: "hello"
    }
}
