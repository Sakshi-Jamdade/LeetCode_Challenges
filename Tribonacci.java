class Tribonacci 
{
    public int tribo(int n) 
	{
        if (n == 0)
		{
            return 0;
        } 
		else if (n == 1 || n == 2) 
		{
            return 1;
        } 
		else 
		{
            int ft = 0;
            int st = 1;
            int tt = 1;
            for (int i = 3; i <= n; i++) 
			{
                int fourthTerm = ft + st + tt;
                ft = st;
                st = tt;
                tt = fourthTerm;
            }
            return tt; // Corrected return statement
        }
    }
}

public class Main 
{
    public static void main(String[] args) 
	{
        Tribonacci d = new Tribonacci();

        int n = 5; // Example input
        int result = d.tribo(n);

        System.out.println("The " + n + "th tribonacci number is: " + result);
    }
}
