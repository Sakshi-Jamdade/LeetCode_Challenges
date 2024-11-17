class PeakElement 
{
    public int findPeakElement(int[] nums) 
    {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) 
        { 
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) 
            {
                left = mid + 1;
            } 
            else 
            {
                right = mid;
            }
        }
        return left;
    }
	public static void main(String []args)
	{
		PeakElement e=new PeakElement();
		int nums[]={1,2,1,3,5,6,4};
		int peak=e.findPeakElement(nums);
		System.out.println(peak);
	}
}
