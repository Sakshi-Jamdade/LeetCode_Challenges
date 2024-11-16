class RotatedSortedArray 
{    
    public int findMin(int[] nums) 
	{
        int left = 0;
        int right = nums.length - 1;

        while (left < right) 
		{
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) 
			{
                left = mid + 1;
            } 
			else 
			{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args)
	{
        RotatedSortedArray solution = new RotatedSortedArray();

        int[] nums1 = {3, 4, 5, 6, 7, 1, 2};
        System.out.println("Minimum in nums1: " + solution.findMin(nums1)); // Output: 1
    }
}
