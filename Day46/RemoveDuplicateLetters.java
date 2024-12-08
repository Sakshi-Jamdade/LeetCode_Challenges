import java.util.HashSet;

public class RemoveDuplicateLetters 
{
    public String removeDuplicateLetters(String s) 
	{
        int[] count = new int[26];
        for (char c : s.toCharArray()) 
		{
            count[c - 'a']++;
        }

        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : s.toCharArray()) 
		{
            count[c - 'a']--;

            if (seen.contains(c)) 
			{
                continue;
            }

            while (result.length() > 0 &&
                   result.charAt(result.length() - 1) > c &&
                   count[result.charAt(result.length() - 1) - 'a'] > 0) 
				   {
                seen.remove(result.charAt(result.length() - 1));
                result.deleteCharAt(result.length() - 1);
            }

            result.append(c);
            seen.add(c);
        }
        return result.toString();
    }

    public static void main(String[] args) 
	{
        RemoveDuplicateLetters solution = new RemoveDuplicateLetters();
        System.out.println(solution.removeDuplicateLetters("bcabc"));   // Output: "abc"
        System.out.println(solution.removeDuplicateLetters("cbacdcbc")); // Output: "acdb"
    }
}
