class SearchInsertPosition 
{
    public int searchInsert(int[] nums, int target) 
	{
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) 
		{
            int mid = left + (right - left) / 2;

            if (target > nums[mid]) 
			{
                left = mid + 1;
            } 
			else if (target < nums[mid]) 
			{
                right = mid - 1;
            } 
			else 
			{
                return mid; 
            }
        }
        return left;  
    }

    public static void main(String[] args) 
	{
        SearchInsertPosition solution = new SearchInsertPosition();

        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = solution.searchInsert(nums, target);
        System.out.println("The target should be at index: " + result);
    }
}