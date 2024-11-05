public class TwoSumSolution 
{
    public int[] twoSum(int[] numbers, int target) 
	{
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) 
		{
            int sum = numbers[left] + numbers[right];

            if (sum == target) 
			{
                return new int[] { left + 1, right + 1 };  // 1-based indices
            } 
			else if (sum < target) 
			{
                left++;
            }
			else 
			{
                right--;
            }
        }
        return new int[] {};  // This line should never be reached due to problem constraints
    }

    public static void main(String[] args) 
	{
        TwoSumSolution solution = new TwoSumSolution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);
        
        // Output the result
        if (result.length == 2) 
		{
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } 
		else 
		{
            System.out.println("No solution found.");
        }
    }
}
