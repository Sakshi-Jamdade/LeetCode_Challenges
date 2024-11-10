class IncreasingTripletSubsequence 
{
    public boolean increasingTriplet(int[] nums) 
	{
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) 
		{
            if (num <= first) 
			{
                first = num; // smallest so far
            } 
			else if (num <= second) 
			{
                second = num; // second smallest so far
            } 
			else 
			{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
	{
        IncreasingTripletSubsequence solution = new IncreasingTripletSubsequence();

        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println("Test Case 1: " + solution.increasingTriplet(nums1)); // Expected: true

        // Test case 2
        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println("Test Case 2: " + solution.increasingTriplet(nums2)); // Expected: false

	}
}
