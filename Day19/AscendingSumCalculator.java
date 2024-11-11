class AscendingSumCalculator 
{
    public int maxAscendingSum(int[] nums) 
	{
        int maxSum = 0;
        int currentSum = nums[nums.length - 1];
        
        for (int i = nums.length - 2; i >= 0; i--) 
		{
            if (nums[i] < nums[i + 1]) 
			{ 
                currentSum += nums[i];
            } 
			else 
			{ 
                if (currentSum > maxSum) 
				{
                    maxSum = currentSum;
                }
                currentSum = nums[i];
            }
        }
        
        if (currentSum > maxSum) 
		{ 
            maxSum = currentSum;
        }
        
        return maxSum;
    }

    public static void main(String[] args) 
	{		
        AscendingSumCalculator calculator = new AscendingSumCalculator();
        int[] nums = {10, 20, 30, 5, 10, 50};
        int result = calculator.maxAscendingSum(nums);
        System.out.println("The maximum ascending sum is: " + result);
    }
}
