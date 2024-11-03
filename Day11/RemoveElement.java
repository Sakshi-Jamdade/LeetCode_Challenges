class RemoveElement 
{
    public int removeElement(int[] nums, int val) 
	{
        int i = 0;
        for (int j = 0; j < nums.length; j++) 
		{
            if (nums[j] != val) 
			{
                nums[i] = nums[j];  // Copy non-val elements to the front
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) 
	{
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3, 4, 2, 5};
        int val = 2;
        
        int newLength = removeElement.removeElement(nums, val);
        
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        
        for (int k = 0; k < newLength; k++) 
		{
            System.out.print(nums[k] + " ");
        }
    }
}
