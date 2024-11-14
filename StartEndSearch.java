class StartEndSearch 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] result = {-1, -1}; 

        while (left <= right) 
        {
            if (nums[left] == target) 
            {
                result[0] = left; 
                break;
            }
            left++;
        }

        while (right >= left) 
        {
            if (nums[right] == target) 
            {
                result[1] = right; 
                break;
            }
            right--;
        }

        return result;
    }
    
    public static void main(String[] args)
    {
        StartEndSearch se = new StartEndSearch();
        int[] nums = {10, 2, 3, 1, 5, 67, 1, 3};
        int target = 1;
        
        int[] result = se.searchRange(nums, target);
        System.out.println("Start index: " + result[0] + ", End index: " + result[1]);
    }
}
