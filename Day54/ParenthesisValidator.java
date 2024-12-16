class ParenthesisValidator 
{
    public int minAddToMakeValid(String s) 
	{
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++)
		{
            char ch = s.charAt(i);
            if (ch == '(') 
			{
                openCount++;
            } 
			else if (ch == ')') 
			{
                if (openCount > 0) 
				{
                    openCount--;
                } 
				else 
				{
                    closeCount++;
                }
            }
        }

        return openCount + closeCount;
    }

    public static void main(String[] args) 
	{
        ParenthesisValidator validator = new ParenthesisValidator();
        String s = "()))";
        System.out.println(validator.minAddToMakeValid(s));
    }
}
