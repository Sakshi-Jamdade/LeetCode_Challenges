class SortColors 
{
    public void sortColors(int[] nums) 
    {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) 
        {
            if (nums[mid] == 0) 
            {
                swap(nums, low, mid);
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) 
            {
                mid++;
            } 
            else 
            { 
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) 
    {
        SortColors obj = new SortColors();
        
        // Test array
        int[] nums = {2, 0, 2, 1, 1, 0};

        // Print array before sorting
        System.out.println("Before sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Sort the array
        obj.sortColors(nums);

        // Print array after sorting
        System.out.println("\nAfter sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
