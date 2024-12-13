class ConsecutiveCharacters 
{
    public int maxPower(String s) 
    {
        int maxPower = 1; 
        int currentPower = 1;

        for (int i = 1; i < s.length(); i++) 
        {
            if (s.charAt(i) == s.charAt(i - 1)) 
            {
                currentPower++; 
                maxPower = Math.max(maxPower, currentPower);
            } 
            else 
            {
                currentPower = 1; 
            }
        }
        return maxPower;
    }

    public static void main(String[] args) 
    {
        ConsecutiveCharacters solution = new Solution();

        String test1 = "abbcccddddeeeeee";
        String test2 = "aaaa";
        String test3 = "abcde";
        String test4 = "trrrreeessss";
        
        System.out.println("Max Power of 'abbcccddddeeeeee': " + solution.maxPower(test1)); // Output: 6
        System.out.println("Max Power of 'aaaa': " + solution.maxPower(test2));            // Output: 4
        System.out.println("Max Power of 'abcde': " + solution.maxPower(test3));          // Output: 1
        System.out.println("Max Power of 'trrrreeessss': " + solution.maxPower(test4));   // Output: 4
    }
}
