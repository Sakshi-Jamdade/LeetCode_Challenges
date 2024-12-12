import java.util.HashMap;
import java.util.Map;

public class RedistributeCharacters 
{
    public boolean makeEqual(String[] words) 
	{
        Map<Character, Integer> charCount = new HashMap<>();
        for (String word : words) 
		{
            for (char c : word.toCharArray()) 
			{
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        
		int n = words.length;
        for (int count : charCount.values()) 
		{
            if (count % n != 0) 
			{
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) 
	{
        RedistributeCharacters solution = new RedistributeCharacters();
        
        String[] words1 = {"abc", "aabc", "bc"};
        System.out.println(solution.makeEqual(words1)); // Output: true
        
        String[] words2 = {"ab", "a"};
        System.out.println(solution.makeEqual(words2)); // Output: false
    }
}
