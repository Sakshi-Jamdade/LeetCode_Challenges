public class MaxWaterContainer 
{
    public int findMaxWater(int[] height) 
	{
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) 
		{
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) 
			{
                left++;
            } 
			else 
			{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) 
	{
        MaxWaterContainer container = new MaxWaterContainer();
        
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max water for height1: " + container.findMaxWater(height1)); // Output: 49
        
        int[] height2 = {1, 1};
        System.out.println("Max water for height2: " + container.findMaxWater(height2)); // Output: 1
    }
}
