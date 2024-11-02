class FindMissingNumber 
{
    public int missingNumber(int[] nums) 
	{
        int range = nums.length;
        int actualSum = (range * (range + 1) / 2);
        int currentSum = 0;
		
        for (int i = 0; i < nums.length; i++) 
		{
            currentSum = currentSum + nums[i];
        }
		
        int ans = actualSum - currentSum;
        return ans;
    }
}

public class Main 
{
    public static void main(String[] args) 
	{
        FindMissingNumber findMissingNumber = new FindMissingNumber();
		
        int[] nums = {3, 0, 1};
        System.out.println("The missing number is: " + findMissingNumber.missingNumber(nums));
        
        int[] nums2 = {0, 1, 2, 4, 5, 6};
        System.out.println("The missing number is: " + findMissingNumber.missingNumber(nums2));
    }
}
