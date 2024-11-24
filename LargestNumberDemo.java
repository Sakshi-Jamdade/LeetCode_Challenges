import java.util.Arrays;

public class LargestNumberDemo 
{
    public String largestNumber(int[] nums) 
	{
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) 
		{
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        
        if (strNums[0].equals("0")) 
		{
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strNums) 
		{
            result.append(str);
        }

        return result.toString();
    }

    public static void main(String[] args) 
	{
        LargestNumberDemo solution = new LargestNumberDemo();
        
        int[] nums1 = {10, 2};
        System.out.println("Largest Number: " + solution.largestNumber(nums1)); // Output: 210

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println("Largest Number: " + solution.largestNumber(nums2)); // Output: 9534330

        int[] nums3 = {0, 0};
        System.out.println("Largest Number: " + solution.largestNumber(nums3)); // Output: 0
    }
}
