public class MaximumCount 
{
    public static int maximumCount(int[] nums) 
	{
        int n = nums.length;
        int i = 0;  
        int j = n - 1;  

        while (i < n && nums[i] < 0) 
		{
            i++;
        }

        while (j >= 0 && nums[j] > 0) 
		{
            j--;
        }

        int posCount = n - 1 - j;
        int negCount = i;

        return Math.max(negCount, posCount);
    }

    public static void main(String[] args) 
	{
        int[] nums = {-4, -3, -2, 0, 1, 2, 3, 4};
        System.out.println(maximumCount(nums));  // Output: 4
    }
}
