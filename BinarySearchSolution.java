class BinarySearchSolution   
{  
    public int search(int[] nums, int target)   
    {  
        int n = nums.length;  
        int low = 0, high = n - 1, mid;  

        while (low <= high)  
        {  
            mid = (low + high) / 2;  

            if (nums[mid] == target)  
            {  
                return mid; 
            }  
            else if (nums[mid] < target)  
            {  
                low = mid + 1;  
            }  
            else  
            {  
                high = mid - 1;   
            }  
        }  
        return -1;  
    }  

    public static void main(String[] args)   
    {  
        BinarySearchSolution solution = new BinarySearchSolution();  
        int[] nums = { -1, 0, 3, 5, 9, 12 };  
        int target = 9;  

        int result = solution.search(nums, target);  

        if (result != -1)  
        {  
            System.out.println("Element found at index: " + result);  
        }  
        else  
        {  
            System.out.println("Element not found.");  
        }  
    }  
}
