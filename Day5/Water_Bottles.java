public class Water_Bottles 
{
    public int numWaterBottles(int numBottles, int numExchange) 
    {
        int ans = numBottles;
        while (numBottles >= numExchange) 
        {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;  
            ans += newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Water_Bottles solution = new Water_Bottles();
        
        // Test cases
        System.out.println(solution.numWaterBottles(9, 3));  // Output: 13
        System.out.println(solution.numWaterBottles(15, 4)); // Output: 19
        System.out.println(solution.numWaterBottles(5, 5));  // Output: 6
        System.out.println(solution.numWaterBottles(2, 2));  // Output: 3
    }
}
