public class DominantIndexFinder 
{
    public int dominantIndex(int[] nums) 
	{
        int maxIndex = 0;
        
        // Find the largest number's index
        for (int i = 1; i < nums.length; i++) 
		{
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        
        // Check if the largest number is at least twice every other number
        for (int i = 0; i < nums.length; i++) 
		{
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) 
			{
                return -1;
            }
        }
        
        return maxIndex;
    }

    public static void main(String[] args) 
	{
        DominantIndexFinder finder = new DominantIndexFinder();
        
        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};
        
        System.out.println("Result for nums1: " + finder.dominantIndex(nums1));  // Output: 1
        System.out.println("Result for nums2: " + finder.dominantIndex(nums2));  // Output: -1
    }
}
