class ProductOfArrayExceptSelf 
{
    public int[] productExceptSelf(int[] nums) 
	{
        int n = nums.length;
        int[] answer = new int[n];

        int prefix = 1;
        for (int i = 0; i < n; i++) 
		{
            answer[i] = prefix;
            prefix *= nums[i];
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) 
		{
            answer[i] *= suffix;
            suffix *= nums[i];
        }
        return answer;
    }

    // Main method for testing
    public static void main(String[] args) 
	{
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solution.productExceptSelf(nums1);
		
        System.out.print("Output for nums = [1, 2, 3, 4]: ");
        for (int num : result1) 
		{
            System.out.print(num + " ");
        }
        
        System.out.println();
        
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solution.productExceptSelf(nums2);
		
        System.out.print("Output for nums = [-1, 1, 0, -3, 3]: ");
        for (int num : result2) 
		{
            System.out.print(num + " ");
        }
    }
}
