public class PivotIndexFinder 
{
    public int pivotIndex(int[] nums) 
	{
        int totalSum = 0;
        for (int num : nums) 
		{
            totalSum += num;
        }
        
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) 
		{
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) 
			{
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) 
	{
        PivotIndexFinder solution = new PivotIndexFinder();
        
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.pivotIndex(nums1));
        
        int[] nums2 = {1, 2, 3};
        System.out.println(solution.pivotIndex(nums2));
        
        int[] nums3 = {2, 1, -1};
        System.out.println(solution.pivotIndex(nums3));
    }
}
