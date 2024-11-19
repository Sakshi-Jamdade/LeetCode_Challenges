class SingleElementFinder 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) 
        {
            int mid = left + (right - left) / 2;

            if (mid % 2 == 1) 
            {
                mid--;
            }

            // If mid pair is valid, move to the right side
            if (nums[mid] == nums[mid + 1]) 
            {
                left = mid + 2;
            } 
            else 
            {
                // Move to the left side including mid
                right = mid;
            }
        }

        return nums[left];
    }
	
    public static void main(String[] args) 
    {
        SingleElementFinder finder = new SingleElementFinder();
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8}; 
        int result = finder.singleNonDuplicate(nums);
        System.out.println("The single non-duplicate element is: " + result);
    }
}
