class Fibonacci 
{
    public int fib(int n) 
	{
        if (n == 0) 
		{
            return 0;
        } 
		else if (n == 1) 
		{
            return 1;
        }
        
        int ft = 0;
        int st = 1;
        for (int i = 2; i <= n; i++) 
		{
            int tt = ft + st;
            ft = st;
            st = tt;
        }
        return st;
    }

    public static void main(String[] args) 
	{
        Fibonacci fibonacci = new Fibonacci();
        int n = 10; 
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci.fib(n));
    }
}
