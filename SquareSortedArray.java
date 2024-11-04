public class SquareSortedArray 
{
    public int[] sortedSquares(int[] nums) 
	{
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) 
		{
            if (Math.abs(nums[left]) > Math.abs(nums[right])) 
			{
                result[pos] = nums[left] * nums[left];
                left++;
            } 
			else 
			{
                result[pos] = nums[right] * nums[right];
                right--;
            }
            pos--;
        }

        return result;
    }

    public static void main(String[] args) 
	{
        SquareSortedArray solution = new SquareSortedArray();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);

        for (int num : result) 
		{
            System.out.print(num + " ");
        }
    }
}
