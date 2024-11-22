class WaterTrapCalculator 
{
    public int calculateTrappedWater(int[] heights) 
	{
        int n = heights.length;
        if (n == 0) return 0;  

        // Arrays to store the max height seen from left and right at each position
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill the leftMax array
        leftMax[0] = heights[0];
        for (int i = 1; i < n; i++) 
		{
            leftMax[i] = Math.max(leftMax[i - 1], heights[i]);
        }

        // Fill the rightMax array
        rightMax[n - 1] = heights[n - 1];
        for (int i = n - 2; i >= 0; i--) 
		{
            rightMax[i] = Math.max(rightMax[i + 1], heights[i]);
        }

        // Calculate the total water trapped
        int totalWater = 0;
        for (int i = 0; i < n; i++) 
		{
            totalWater += Math.min(leftMax[i], rightMax[i]) - heights[i];
        }

        return totalWater;
    }

    // Main method to test the code
    public static void main(String[] args) 
	{
        WaterTrapCalculator calculator = new WaterTrapCalculator();
        
        int[] heights1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Water for heights1: " + calculator.calculateTrappedWater(heights1));  // Output should be 6
        
        int[] heights2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped Water for heights2: " + calculator.calculateTrappedWater(heights2));  // Output should be 9
    }
}
