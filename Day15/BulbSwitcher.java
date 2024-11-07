public class BulbSwitcher 
{
    public int bulbSwitch(int n) 
	{
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) 
	{
        BulbSwitcher solution = new BulbSwitcher();

        int n = 3;
        System.out.println("Input: n = " + n + " -> Output: " + solution.bulbSwitch(n));  // Output: 1
    }
}
