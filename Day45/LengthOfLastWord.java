public class LengthOfLastWord 
{
    public int lengthOfLastWord(String s) 
	{
        s = s.trim();  
        int lastSpaceIndex = s.lastIndexOf(' ');  
        return s.length() - lastSpaceIndex - 1;  
    }

    public static void main(String[] args) 
	{
        LengthOfLastWord solution = new LengthOfLastWord();
        
        String s1 = "Hello World";
        System.out.println(solution.lengthOfLastWord(s1));  // Output: 5
        
        String s2 = "   fly me   to   the moon  ";
        System.out.println(solution.lengthOfLastWord(s2));  // Output: 4
    }
}
