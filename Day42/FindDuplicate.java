public class FindDuplicate 
{
    public int findDuplicate(int[] nums) 
	{
        int i = nums[0];
        int j = nums[0];

        do 
		{
            i = nums[i];
            j = nums[nums[j]];
        } while (i != j);

        i = nums[0];

        while (i != j) 
		{
            i = nums[i];
            j = nums[j];
        }

        return j;
    }

    public static void main(String[] args) 
	{
        FindDuplicate solution = new FindDuplicate();
        
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};
        
        System.out.println("Duplicate in nums1: " + solution.findDuplicate(nums1)); // Output: 2
        System.out.println("Duplicate in nums2: " + solution.findDuplicate(nums2)); // Output: 3
    }
}
