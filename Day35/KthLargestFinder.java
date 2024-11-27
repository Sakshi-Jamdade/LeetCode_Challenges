public class KthLargestFinder 
{
    public int findKthLargest(int[] nums, int k) 
	{
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) 
		{
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int[] freq = new int[max - min + 1];
        for (int num : nums) 
		{
            freq[num - min]++;
        }

        int count = 0;
        for (int i = freq.length - 1; i >= 0; i--) 
		{
            count += freq[i];
            if (count >= k) 
			{
                return i + min;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
	{
        KthLargestFinder finder = new KthLargestFinder();
        
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        System.out.println("The 2nd largest element is: " + finder.findKthLargest(nums1, k1));

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        System.out.println("The 4th largest element is: " + finder.findKthLargest(nums2, k2));
    }
}
